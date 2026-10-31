package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class gu {
    public final hu f26523a;

    public gu(hu huVar) {
        this.f26523a = huVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.i0.g3(new ho(this, 12));
        }
    }
}
