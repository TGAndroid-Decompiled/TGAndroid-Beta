package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ou {
    public final pu f27666a;

    public ou(pu puVar) {
        this.f27666a = puVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new vp(this, 11));
        }
    }
}
