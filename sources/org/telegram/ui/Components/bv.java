package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class bv {
    public final cv f25040a;

    public bv(cv cvVar) {
        this.f25040a = cvVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new hq(this, 11));
        }
    }
}
