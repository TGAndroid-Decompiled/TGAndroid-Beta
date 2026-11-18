package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class bd1 {
    public final cd1 f45849a;

    public bd1(cd1 cd1Var) {
        this.f45849a = cd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.c5(16, this, str));
    }
}
