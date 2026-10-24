package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ii1 {
    public final ji1 f38316a;

    public ii1(ji1 ji1Var) {
        this.f38316a = ji1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.y3(20, this, str));
    }
}
