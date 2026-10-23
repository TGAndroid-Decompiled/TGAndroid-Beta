package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class og0 {
    public final org.telegram.ui.rt0 f29171a;

    public og0(org.telegram.ui.rt0 rt0Var) {
        this.f29171a = rt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new d2(this, Integer.parseInt(str), 9));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new mg0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f29171a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f29171a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.rt0 rt0Var = this.f29171a;
        rt0Var.H = i10 * 1000;
        String str = rt0Var.f29556s;
        if (str != null) {
            pg0.a(rt0Var, str);
            rt0Var.f29556s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.rt0 rt0Var = this.f29171a;
        boolean z11 = rt0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        rt0Var.G = z10;
        rt0Var.b(z11);
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
        if (i10 == 3 && rt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new mg0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new ai.z8(this, z12, i10, 2));
    }
}
