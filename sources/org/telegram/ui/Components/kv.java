package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class kv {
    public final lv f28171a;

    public kv(lv lvVar) {
        this.f28171a = lvVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new nq(this, 11));
        }
    }
}
