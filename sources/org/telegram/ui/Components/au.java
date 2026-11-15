package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class au {
    public final bu f33064a;

    public au(bu buVar) {
        this.f33064a = buVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.g0.h3(new fo(this, 12));
        }
    }
}
