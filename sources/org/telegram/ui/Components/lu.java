package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class lu {
    public final mu f30433a;

    public lu(mu muVar) {
        this.f30433a = muVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new rp(this, 11));
        }
    }
}
