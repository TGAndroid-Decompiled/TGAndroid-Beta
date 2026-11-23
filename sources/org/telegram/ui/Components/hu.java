package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class hu {
    public final iu f35920a;

    public hu(iu iuVar) {
        this.f35920a = iuVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.g0.g3(new oo(this, 12));
        }
    }
}
