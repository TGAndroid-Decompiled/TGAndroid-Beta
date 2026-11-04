package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class tt {
    public final ut f38554a;

    public tt(ut utVar) {
        this.f38554a = utVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.g0.h3(new gp(this, 10));
        }
    }
}
