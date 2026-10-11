package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class oj1 {
    public final pj1 f40591a;

    public oj1(pj1 pj1Var) {
        this.f40591a = pj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.i(22, this, str));
    }
}
