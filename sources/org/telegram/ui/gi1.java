package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

public final class gi1 {

    public final hi1 f38423a;

    public gi1(hi1 hi1Var) {
        this.f38423a = hi1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new zh1(2, this, str));
    }
}
