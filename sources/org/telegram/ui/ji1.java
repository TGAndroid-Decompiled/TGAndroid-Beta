package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ji1 {
    public final ki1 f38590a;

    public ji1(ki1 ki1Var) {
        this.f38590a = ki1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.y3(20, this, str));
    }
}
