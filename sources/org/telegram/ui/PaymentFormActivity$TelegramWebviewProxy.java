package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final kl0 f43271a;

    public PaymentFormActivity$TelegramWebviewProxy(kl0 kl0Var) {
        this.f43271a = kl0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new o1(this, str, str2, 1));
    }
}
