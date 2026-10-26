package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class mi1 {
    public final ni1 f41568a;

    public mi1(ni1 ni1Var) {
        this.f41568a = ni1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(10, this, str));
    }
}
