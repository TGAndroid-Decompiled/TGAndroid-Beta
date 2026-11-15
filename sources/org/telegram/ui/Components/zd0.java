package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
public final class zd0 {
    public final org.telegram.ui.bq0 f42342a;

    public zd0(org.telegram.ui.bq0 bq0Var) {
        this.f42342a = bq0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        org.telegram.messenger.g0.h3(new a2(this, Integer.parseInt(str), 11));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        org.telegram.messenger.g0.h3(new xd0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f42342a.K = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i7) {
        this.f42342a.J = i7 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i7) {
        org.telegram.ui.bq0 bq0Var = this.f42342a;
        bq0Var.I = i7 * 1000;
        String str = bq0Var.f32975s;
        if (str != null) {
            ae0.a(bq0Var, str);
            bq0Var.f32975s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.bq0 bq0Var = this.f42342a;
        boolean z11 = bq0Var.H;
        boolean z12 = false;
        int i7 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        bq0Var.H = z10;
        bq0Var.b(z11);
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
        if (i7 == 3 && bq0Var.h.getVisibility() != 4) {
            org.telegram.messenger.g0.i3(new xd0(this, 1), 300L);
        }
        org.telegram.messenger.g0.h3(new di.u7(this, z12, i7, 4));
    }
}
