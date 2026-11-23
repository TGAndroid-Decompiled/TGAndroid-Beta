package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class bd1 {
    public final cd1 f45873a;

    public bd1(cd1 cd1Var) {
        this.f45873a = cd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.u4(18, this, str));
    }
}
