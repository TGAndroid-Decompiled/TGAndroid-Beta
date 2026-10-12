package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class nv {
    public final ov f28969a;

    public nv(ov ovVar) {
        this.f28969a = ovVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new pq(this, 11));
        }
    }
}
