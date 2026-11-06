package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final hl0 f41310a;

    public PaymentFormActivity$TelegramWebviewProxy(hl0 hl0Var) {
        this.f41310a = hl0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new o1(this, str, str2, 1));
    }
}
