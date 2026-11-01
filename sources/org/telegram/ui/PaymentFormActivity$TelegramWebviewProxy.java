package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class PaymentFormActivity$TelegramWebviewProxy {
    public final qm0 f33436a;

    public PaymentFormActivity$TelegramWebviewProxy(qm0 qm0Var) {
        this.f33436a = qm0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new p1(this, str, str2, 1));
    }
}
