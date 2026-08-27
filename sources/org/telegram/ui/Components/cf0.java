package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

public final class cf0 {

    public final org.telegram.ui.ht0 f27413a;

    public cf0(org.telegram.ui.ht0 ht0Var) {
        this.f27413a = ht0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new xl(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new af0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f27413a.F = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f27413a.E = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.ht0 ht0Var = this.f27413a;
        ht0Var.D = i10 * 1000;
        String str = ht0Var.f27744s;
        if (str != null) {
            df0.a(ht0Var, str);
            ht0Var.f27744s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int i10 = Integer.parseInt(str);
        org.telegram.ui.ht0 ht0Var = this.f27413a;
        boolean z10 = ht0Var.C;
        boolean z11 = false;
        int i11 = 1;
        ht0Var.C = i10 == 1 || i10 == 3;
        ht0Var.b(z10);
        if (i10 != 0) {
            if (i10 == 1) {
                z11 = true;
            } else if (i10 != 2) {
                if (i10 == 3) {
                    z11 = true;
                    i11 = 2;
                }
            }
            i11 = 3;
        } else {
            i11 = 4;
        }
        if (i11 == 3 && ht0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new af0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new hh.p6(this, z11, i11, 1));
    }
}
