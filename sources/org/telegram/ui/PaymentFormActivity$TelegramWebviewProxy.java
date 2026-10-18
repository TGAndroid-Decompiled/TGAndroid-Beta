package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final go0 f33225a;

    public PaymentFormActivity$TelegramWebviewProxy(go0 go0Var) {
        this.f33225a = go0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new t1(this, str, str2, 1));
    }
}
