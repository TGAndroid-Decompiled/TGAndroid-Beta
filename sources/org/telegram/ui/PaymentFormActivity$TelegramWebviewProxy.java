package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final dl0 f41367a;

    public PaymentFormActivity$TelegramWebviewProxy(dl0 dl0Var) {
        this.f41367a = dl0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new p1(this, str, str2, 1));
    }
}
