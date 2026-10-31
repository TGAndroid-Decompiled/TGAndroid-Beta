package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final sm0 f33429a;

    public PaymentFormActivity$TelegramWebviewProxy(sm0 sm0Var) {
        this.f33429a = sm0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new p1(this, str, str2, 1));
    }
}
