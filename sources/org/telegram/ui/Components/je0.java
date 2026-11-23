package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class je0 {
    public final org.telegram.ui.dq0 f36396a;

    public je0(org.telegram.ui.dq0 dq0Var) {
        this.f36396a = dq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.ii(this, Integer.parseInt(str), 16));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.g3(new he0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f36396a.K = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i7) {
        this.f36396a.J = i7 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i7) {
        org.telegram.ui.dq0 dq0Var = this.f36396a;
        dq0Var.I = i7 * 1000;
        String str = dq0Var.f36727s;
        if (str != null) {
            ke0.a(dq0Var, str);
            dq0Var.f36727s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.dq0 dq0Var = this.f36396a;
        boolean z11 = dq0Var.H;
        boolean z12 = false;
        int i7 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        dq0Var.H = z10;
        dq0Var.b(z11);
        if (parseInt != 0) {
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        z12 = true;
                        i7 = 2;
                    }
                }
            } else {
                z12 = true;
            }
            i7 = 3;
        } else {
            i7 = 4;
        }
        if (i7 == 3 && dq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.h3(new he0(this, 1), 300L);
        }
        org.telegram.messenger.g0.g3(new di.x7(this, z12, i7, 4));
    }
}
