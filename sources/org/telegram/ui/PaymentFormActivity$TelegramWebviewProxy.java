package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final ml0 f43151a;

    public PaymentFormActivity$TelegramWebviewProxy(ml0 ml0Var) {
        this.f43151a = ml0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new o1(this, str, str2, 1));
    }
}
