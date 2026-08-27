package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

public final class eu {

    public final fu f28152a;

    public eu(fu fuVar) {
        this.f28152a = fuVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new lp(this, 11));
        }
    }
}
