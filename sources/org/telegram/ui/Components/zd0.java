package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class zd0 {
    public final org.telegram.ui.cq0 f40917a;

    public zd0(org.telegram.ui.cq0 cq0Var) {
        this.f40917a = cq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new r2(this, Integer.parseInt(str), 8));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new xd0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f40917a.J = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i7) {
        this.f40917a.I = i7 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i7) {
        org.telegram.ui.cq0 cq0Var = this.f40917a;
        cq0Var.H = i7 * 1000;
        String str = cq0Var.f31794s;
        if (str != null) {
            ae0.a(cq0Var, str);
            cq0Var.f31794s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z9;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.cq0 cq0Var = this.f40917a;
        boolean z10 = cq0Var.G;
        boolean z11 = false;
        int i7 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        cq0Var.G = z9;
        cq0Var.b(z10);
        if (parseInt != 0) {
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        z11 = true;
                        i7 = 2;
                    }
                }
            } else {
                z11 = true;
            }
            i7 = 3;
        } else {
            i7 = 4;
        }
        if (i7 == 3 && cq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new xd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new bi.c9(this, z11, i7, 4));
    }
}
