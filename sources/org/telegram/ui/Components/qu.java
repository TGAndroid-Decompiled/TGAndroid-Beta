package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class qu {
    public final ru f30527a;

    public qu(ru ruVar) {
        this.f30527a = ruVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new xp(this, 11));
        }
    }
}
