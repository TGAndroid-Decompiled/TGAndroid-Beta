package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class lf0 {
    public final org.telegram.ui.et0 f30303a;

    public lf0(org.telegram.ui.et0 et0Var) {
        this.f30303a = et0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new i8(this, Integer.parseInt(str), 6));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new jf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f9) {
        this.f30303a.F = f9;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f30303a.E = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.et0 et0Var = this.f30303a;
        et0Var.D = i10 * 1000;
        String str = et0Var.f30678s;
        if (str != null) {
            mf0.a(et0Var, str);
            et0Var.f30678s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.et0 et0Var = this.f30303a;
        boolean z11 = et0Var.C;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        et0Var.C = z10;
        et0Var.b(z11);
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
        if (i10 == 3 && et0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new jf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new jh.n6(this, z12, i10, 1));
    }
}
