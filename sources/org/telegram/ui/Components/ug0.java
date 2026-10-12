package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ug0 {
    public final org.telegram.ui.lu0 f31165a;

    public ug0(org.telegram.ui.lu0 lu0Var) {
        this.f31165a = lu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new nd(this, Integer.parseInt(str), 6));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new sg0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f31165a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f31165a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.lu0 lu0Var = this.f31165a;
        lu0Var.H = i10 * 1000;
        String str = lu0Var.f31510s;
        if (str != null) {
            vg0.a(lu0Var, str);
            lu0Var.f31510s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.lu0 lu0Var = this.f31165a;
        boolean z11 = lu0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        lu0Var.G = z10;
        lu0Var.b(z11);
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
        if (i10 == 3 && lu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new sg0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, z12, i10, 1));
    }
}
