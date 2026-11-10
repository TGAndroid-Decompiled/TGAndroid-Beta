package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final kl0 f41336a;

    public PaymentFormActivity$TelegramWebviewProxy(kl0 kl0Var) {
        this.f41336a = kl0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new o1(this, str, str2, 1));
    }
}
