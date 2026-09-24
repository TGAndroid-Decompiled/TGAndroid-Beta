package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class vu {
    public final wu f29800a;

    public vu(wu wuVar) {
        this.f29800a = wuVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new yp(this, 11));
        }
    }
}
