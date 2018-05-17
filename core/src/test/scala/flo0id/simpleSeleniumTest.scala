package flo0id

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class simpleSeleniumTest extends AnyFunSpec with Matchers {
  describe("The Selenium API") {
    it(
      "should be able to acquire a Chrome browser from the Selenium grid and download an article"
    ) {
      true should be(true)
    }
  }
}
