package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class oi1 {
    public final pi1 f42101a;

    public oi1(pi1 pi1Var) {
        this.f42101a = pi1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.a6(11, this, str));
    }
}
