package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class oj1 {
    public final pj1 f36244a;

    public oj1(pj1 pj1Var) {
        this.f36244a = pj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new pb1(20, this, str));
    }
}
