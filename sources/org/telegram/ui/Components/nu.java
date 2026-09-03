package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class nu {
    public final ou f27367a;

    public nu(ou ouVar) {
        this.f27367a = ouVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new up(this, 11));
        }
    }
}
