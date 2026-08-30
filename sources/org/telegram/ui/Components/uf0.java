package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class uf0 {
    public final org.telegram.ui.nt0 f29212a;

    public uf0(org.telegram.ui.nt0 nt0Var) {
        this.f29212a = nt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new hm(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new sf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f29212a.G = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f29212a.F = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.nt0 nt0Var = this.f29212a;
        nt0Var.E = i10 * 1000;
        String str = nt0Var.f29454s;
        if (str != null) {
            vf0.a(nt0Var, str);
            nt0Var.f29454s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z4;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.nt0 nt0Var = this.f29212a;
        boolean z10 = nt0Var.D;
        boolean z11 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z4 = false;
        } else {
            z4 = true;
        }
        nt0Var.D = z4;
        nt0Var.b(z10);
        if (parseInt != 0) {
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        z11 = true;
                        i10 = 2;
                    }
                }
            } else {
                z11 = true;
            }
            i10 = 3;
        } else {
            i10 = 4;
        }
        if (i10 == 3 && nt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new sf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new lh.n6(this, z11, i10, 1));
    }
}
