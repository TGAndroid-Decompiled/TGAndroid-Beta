package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class nj1 {
    public final oj1 f35994a;

    public nj1(oj1 oj1Var) {
        this.f35994a = oj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new nb1(20, this, str));
    }
}
