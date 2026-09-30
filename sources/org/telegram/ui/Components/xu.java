package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xu {
    public final yu f30506a;

    public xu(yu yuVar) {
        this.f30506a = yuVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new aq(this, 11));
        }
    }
}
