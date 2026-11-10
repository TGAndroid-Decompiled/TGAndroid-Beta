package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class zd0 {
    public final org.telegram.ui.fq0 f40919a;

    public zd0(org.telegram.ui.fq0 fq0Var) {
        this.f40919a = fq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new q2(this, Integer.parseInt(str), 8));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new xd0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f40919a.J = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i7) {
        this.f40919a.I = i7 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i7) {
        org.telegram.ui.fq0 fq0Var = this.f40919a;
        fq0Var.H = i7 * 1000;
        String str = fq0Var.f31848s;
        if (str != null) {
            ae0.a(fq0Var, str);
            fq0Var.f31848s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z9;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.fq0 fq0Var = this.f40919a;
        boolean z10 = fq0Var.G;
        boolean z11 = false;
        int i7 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        fq0Var.G = z9;
        fq0Var.b(z10);
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
        if (i7 == 3 && fq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new xd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new bi.c9(this, z11, i7, 4));
    }
}
