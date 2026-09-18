package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class nj1 {
    public final oj1 f36124a;

    public nj1(oj1 oj1Var) {
        this.f36124a = oj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new qb1(20, this, str));
    }
}
