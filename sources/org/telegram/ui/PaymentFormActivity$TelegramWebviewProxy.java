package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

class PaymentFormActivity$TelegramWebviewProxy {

    public final do0 f35581a;

    public PaymentFormActivity$TelegramWebviewProxy(do0 do0Var) {
        this.f35581a = do0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new u1(this, str, str2, 1));
    }
}
