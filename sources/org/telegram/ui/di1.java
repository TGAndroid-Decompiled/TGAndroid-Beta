package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class di1 {
    public final ei1 f36227a;

    public di1(ei1 ei1Var) {
        this.f36227a = ei1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.u3(20, this, str));
    }
}
