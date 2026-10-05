package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ej1 {
    public final fj1 f36064a;

    public ej1(fj1 fj1Var) {
        this.f36064a = fj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new e91(23, this, str));
    }
}
