package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class bd1 {
    public final cd1 f44017a;

    public bd1(cd1 cd1Var) {
        this.f44017a = cd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new wb1(29, this, str));
    }
}
