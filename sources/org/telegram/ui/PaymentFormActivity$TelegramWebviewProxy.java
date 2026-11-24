package org.telegram.ui;

import android.webkit.JavascriptInterface;
class PaymentFormActivity$TelegramWebviewProxy {
    public final p a;

    public PaymentFormActivity$TelegramWebviewProxy(p pVar) {
        this.a = pVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        gl.c3(new h(this, str, str2, (byte) 1));
    }
}
