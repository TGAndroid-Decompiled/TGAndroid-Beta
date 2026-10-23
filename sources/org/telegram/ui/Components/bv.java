package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class bv {
    public final cv f25154a;

    public bv(cv cvVar) {
        this.f25154a = cvVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new zp(this, 12));
        }
    }
}
