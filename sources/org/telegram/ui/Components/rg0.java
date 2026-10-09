package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class rg0 {
    public final org.telegram.ui.ju0 f30440a;

    public rg0(org.telegram.ui.ju0 ju0Var) {
        this.f30440a = ju0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new nd(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new pg0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f30440a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f30440a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.ju0 ju0Var = this.f30440a;
        ju0Var.H = i10 * 1000;
        String str = ju0Var.f30789s;
        if (str != null) {
            sg0.a(ju0Var, str);
            ju0Var.f30789s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ju0 ju0Var = this.f30440a;
        boolean z11 = ju0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        ju0Var.G = z10;
        ju0Var.b(z11);
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
        if (i10 == 3 && ju0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new pg0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z12, i10, 1));
    }
}
