package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class nj1 {
    public final oj1 f36046a;

    public nj1(oj1 oj1Var) {
        this.f36046a = oj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new w81(26, this, str));
    }
}
