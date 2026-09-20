package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class uu {
    public final vu f28856a;

    public uu(vu vuVar) {
        this.f28856a = vuVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new xp(this, 11));
        }
    }
}
