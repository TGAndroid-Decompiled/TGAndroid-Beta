package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class gj1 {
    public final hj1 f33953a;

    public gj1(hj1 hj1Var) {
        this.f33953a = hj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new p81(25, this, str));
    }
}
