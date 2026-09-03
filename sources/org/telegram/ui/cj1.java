package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class cj1 {
    public final dj1 f33179a;

    public cj1(dj1 dj1Var) {
        this.f33179a = dj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new sg1(7, this, str));
    }
}
