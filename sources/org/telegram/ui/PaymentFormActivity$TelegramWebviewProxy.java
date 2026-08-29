package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final bo0 f35645a;

    public PaymentFormActivity$TelegramWebviewProxy(bo0 bo0Var) {
        this.f35645a = bo0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new u1(this, str, str2, 1));
    }
}
