package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ej1 {
    public final fj1 f33277a;

    public ej1(fj1 fj1Var) {
        this.f33277a = fj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new fb1(21, this, str));
    }
}
