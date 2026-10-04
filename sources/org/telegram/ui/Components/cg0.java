package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class cg0 {
    public final org.telegram.ui.du0 f25363a;

    public cg0(org.telegram.ui.du0 du0Var) {
        this.f25363a = du0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new ld(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new ag0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f25363a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f25363a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.du0 du0Var = this.f25363a;
        du0Var.H = i10 * 1000;
        String str = du0Var.f25722s;
        if (str != null) {
            dg0.a(du0Var, str);
            du0Var.f25722s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.du0 du0Var = this.f25363a;
        boolean z11 = du0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        du0Var.G = z10;
        du0Var.b(z11);
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
        if (i10 == 3 && du0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new ag0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z12, i10, 1));
    }
}
