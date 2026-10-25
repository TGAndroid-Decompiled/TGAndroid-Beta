package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class cv {
    public final dv f27266a;

    public cv(dv dvVar) {
        this.f27266a = dvVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            AndroidUtilities.runOnUIThread(new bq(this, 12));
        }
    }
}
