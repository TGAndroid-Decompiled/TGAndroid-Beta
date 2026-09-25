package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class zf0 {
    public final org.telegram.ui.au0 f30866a;

    public zf0(org.telegram.ui.au0 au0Var) {
        this.f30866a = au0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new ld(this, Integer.parseInt(str), 5));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new xf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f30866a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f30866a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.au0 au0Var = this.f30866a;
        au0Var.H = i10 * 1000;
        String str = au0Var.f22682s;
        if (str != null) {
            ag0.a(au0Var, str);
            au0Var.f22682s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.au0 au0Var = this.f30866a;
        boolean z11 = au0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        au0Var.G = z10;
        au0Var.b(z11);
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
        if (i10 == 3 && au0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new xf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z12, i10, 1));
    }
}
