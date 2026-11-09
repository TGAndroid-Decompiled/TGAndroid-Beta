package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final jl0 f41345a;

    public PaymentFormActivity$TelegramWebviewProxy(jl0 jl0Var) {
        this.f41345a = jl0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new o1(this, str, str2, 1));
    }
}
