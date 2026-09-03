package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class wf0 {
    public final org.telegram.ui.ut0 f32746a;

    public wf0(org.telegram.ui.ut0 ut0Var) {
        this.f32746a = ut0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new im(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new uf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f32746a.G = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f32746a.F = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.ut0 ut0Var = this.f32746a;
        ut0Var.E = i10 * 1000;
        String str = ut0Var.f33060s;
        if (str != null) {
            xf0.a(ut0Var, str);
            ut0Var.f33060s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z4;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ut0 ut0Var = this.f32746a;
        boolean z10 = ut0Var.D;
        boolean z11 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z4 = false;
        } else {
            z4 = true;
        }
        ut0Var.D = z4;
        ut0Var.b(z10);
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
        if (i10 == 3 && ut0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new uf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new mh.n6(this, z11, i10, 1));
    }
}
