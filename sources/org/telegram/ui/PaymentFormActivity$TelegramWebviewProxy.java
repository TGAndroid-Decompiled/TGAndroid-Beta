package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final lo0 f31668a;

    public PaymentFormActivity$TelegramWebviewProxy(lo0 lo0Var) {
        this.f31668a = lo0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new u1(this, str, str2, 1));
    }
}
