package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xf0 {
    public final org.telegram.ui.iu0 f30258a;

    public xf0(org.telegram.ui.iu0 iu0Var) {
        this.f30258a = iu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new kd(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new vf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f30258a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f30258a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.iu0 iu0Var = this.f30258a;
        iu0Var.H = i10 * 1000;
        String str = iu0Var.f30519s;
        if (str != null) {
            yf0.a(iu0Var, str);
            iu0Var.f30519s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.iu0 iu0Var = this.f30258a;
        boolean z11 = iu0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        iu0Var.G = z10;
        iu0Var.b(z11);
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
        if (i10 == 3 && iu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new vf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.f0(this, z12, i10, 1));
    }
}
