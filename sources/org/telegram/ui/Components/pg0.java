package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class pg0 {
    public final org.telegram.ui.pu0 f28309a;

    public pg0(org.telegram.ui.pu0 pu0Var) {
        this.f28309a = pu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new o8(this, Integer.parseInt(str), 7));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new ng0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f28309a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f28309a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.pu0 pu0Var = this.f28309a;
        pu0Var.H = i10 * 1000;
        String str = pu0Var.f28597s;
        if (str != null) {
            qg0.a(pu0Var, str);
            pu0Var.f28597s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.pu0 pu0Var = this.f28309a;
        boolean z11 = pu0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        pu0Var.G = z10;
        pu0Var.b(z11);
        if (parseInt != 0) {
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        z12 = true;
                        i10 = 2;
                    }
                }
            } else {
                z12 = true;
            }
            i10 = 3;
        } else {
            i10 = 4;
        }
        if (i10 == 3 && pu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new ng0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.i0(this, z12, i10, 1));
    }
}
