package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class ut {
    public final vt f38744a;

    public ut(vt vtVar) {
        this.f38744a = vtVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.g0.h3(new gp(this, 10));
        }
    }
}
