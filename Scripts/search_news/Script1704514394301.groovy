import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//open browser
WebUI.openBrowser('')

//open url
WebUI.navigateToUrl(GlobalVariable.Global_Url)

//maximize window browser
WebUI.maximizeWindow()

WebUI.delay(2)

//set text value into search input 
WebUI.setText(findTestObject('Object Repository/Page_Berita Terkini Hari Ini, Kabar Akurat Terpercaya - Kompas.com/search_box'), 
    'iphone 15')

//send keys enter to confirm search
WebUI.sendKeys(findTestObject('Object Repository/Page_Berita Terkini Hari Ini, Kabar Akurat Terpercaya - Kompas.com/search_box'),Keys.chord(Keys.ENTER))

//Delay for 3 second
WebUI.delay(3)

//Click Link page 2
WebUI.click(findTestObject('Object Repository/Page_Berita Terkini Hari Ini, Kabar Akurat Terpercaya - Kompas.com/page_2'))

//delay for 5 seconds
WebUI.delay(5)

//take fullpage screenshot
WebUI.takeFullPageScreenshot()

//delay for 3 seconds
WebUI.delay(3) 

//close browser
WebUI.closeBrowser()

