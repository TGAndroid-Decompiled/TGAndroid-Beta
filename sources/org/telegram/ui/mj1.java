package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class mj1 {
    public final nj1 f35684a;

    public mj1(nj1 nj1Var) {
        this.f35684a = nj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new x81(24, this, str));
    }
}
