package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class cd1 {
    public final dd1 f44333a;

    public cd1(dd1 dd1Var) {
        this.f44333a = dd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new sb1(29, this, str));
    }
}
