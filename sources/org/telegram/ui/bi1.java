package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class bi1 {
    public final ci1 f35636a;

    public bi1(ci1 ci1Var) {
        this.f35636a = ci1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.z3(20, this, str));
    }
}
