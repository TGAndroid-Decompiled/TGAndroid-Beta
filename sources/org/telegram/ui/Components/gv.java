package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class gv {
    public final hv f25425a;

    public gv(hv hvVar) {
        this.f25425a = hvVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new kq(this, 11));
        }
    }
}
