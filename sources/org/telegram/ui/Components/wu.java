package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class wu {
    public final xu f30202a;

    public wu(xu xuVar) {
        this.f30202a = xuVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new zp(this, 11));
        }
    }
}
