package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class vt {
    public final wt f39803a;

    public vt(wt wtVar) {
        this.f39803a = wtVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.g0.h3(new gp(this, 10));
        }
    }
}
