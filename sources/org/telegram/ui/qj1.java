package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class qj1 {
    public final rj1 f41137a;

    public qj1(rj1 rj1Var) {
        this.f41137a = rj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new ii1(23, this, str));
    }
}
