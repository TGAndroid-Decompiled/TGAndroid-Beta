package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class yu {
    public final zu f33258a;

    public yu(zu zuVar) {
        this.f33258a = zuVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new aq(this, 11));
        }
    }
}
