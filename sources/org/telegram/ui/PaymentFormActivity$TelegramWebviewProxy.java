package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final wo0 f30009a;

    public PaymentFormActivity$TelegramWebviewProxy(wo0 wo0Var) {
        this.f30009a = wo0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new s1(this, str, str2, 1));
    }
}
