package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class hi1 {
    public final ii1 f38821a;

    public hi1(ii1 ii1Var) {
        this.f38821a = ii1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new ai1(2, this, str));
    }
}
