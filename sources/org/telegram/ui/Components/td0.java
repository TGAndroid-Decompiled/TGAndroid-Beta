package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class td0 {
    public final org.telegram.ui.tp0 f38396a;

    public td0(org.telegram.ui.tp0 tp0Var) {
        this.f38396a = tp0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new o2(this, Integer.parseInt(str), 8));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new rd0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f38396a.K = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i3) {
        this.f38396a.J = i3 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i3) {
        org.telegram.ui.tp0 tp0Var = this.f38396a;
        tp0Var.I = i3 * 1000;
        String str = tp0Var.f38726s;
        if (str != null) {
            ud0.a(tp0Var, str);
            tp0Var.f38726s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.tp0 tp0Var = this.f38396a;
        boolean z11 = tp0Var.H;
        boolean z12 = false;
        int i3 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        tp0Var.H = z10;
        tp0Var.b(z11);
        if (parseInt != 0) {
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        z12 = true;
                        i3 = 2;
                    }
                }
            } else {
                z12 = true;
            }
            i3 = 3;
        } else {
            i3 = 4;
        }
        if (i3 == 3 && tp0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new rd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new ci.c8(this, z12, i3, 4));
    }
}
