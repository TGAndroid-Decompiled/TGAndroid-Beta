package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final eo0 f33237a;

    public PaymentFormActivity$TelegramWebviewProxy(eo0 eo0Var) {
        this.f33237a = eo0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new t1(this, str, str2, 1));
    }
}
