package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class fu {
    public final gu f35203a;

    public fu(gu guVar) {
        this.f35203a = guVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.g0.g3(new lo(this, 12));
        }
    }
}
