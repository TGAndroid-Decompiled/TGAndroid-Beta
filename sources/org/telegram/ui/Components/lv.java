package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class lv {
    public final mv f28547a;

    public lv(mv mvVar) {
        this.f28547a = mvVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new nq(this, 11));
        }
    }
}
