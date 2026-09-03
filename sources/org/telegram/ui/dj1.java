package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class dj1 {
    public final ej1 f36221a;

    public dj1(ej1 ej1Var) {
        this.f36221a = ej1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new bh1(6, this, str));
    }
}
