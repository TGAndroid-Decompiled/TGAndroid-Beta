package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class ue0 {
    public final org.telegram.ui.lr0 f30946a;

    public ue0(org.telegram.ui.lr0 lr0Var) {
        this.f30946a = lr0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.i0.g3(new qq(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.i0.g3(new se0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f30946a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f30946a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.lr0 lr0Var = this.f30946a;
        lr0Var.H = i10 * 1000;
        String str = lr0Var.f31275s;
        if (str != null) {
            ve0.a(lr0Var, str);
            lr0Var.f31275s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.lr0 lr0Var = this.f30946a;
        boolean z11 = lr0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        lr0Var.G = z10;
        lr0Var.b(z11);
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
        if (i10 == 3 && lr0Var.h.getVisibility() != 4) {
            org.telegram.messenger.i0.h3(new se0(this, 1), 300L);
        }
        org.telegram.messenger.i0.g3(new i2.j0(this, z12, i10, 3));
    }
}
