package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class qg0 {
    public final org.telegram.ui.ou0 f28282a;

    public qg0(org.telegram.ui.ou0 ou0Var) {
        this.f28282a = ou0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new o8(this, Integer.parseInt(str), 7));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new og0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f28282a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f28282a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.ou0 ou0Var = this.f28282a;
        ou0Var.H = i10 * 1000;
        String str = ou0Var.f28529s;
        if (str != null) {
            rg0.a(ou0Var, str);
            ou0Var.f28529s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ou0 ou0Var = this.f28282a;
        boolean z11 = ou0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        ou0Var.G = z10;
        ou0Var.b(z11);
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
        if (i10 == 3 && ou0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new og0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.i0(this, z12, i10, 1));
    }
}
