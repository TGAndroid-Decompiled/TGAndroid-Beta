package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class wf0 {
    public final org.telegram.ui.pt0 f32741a;

    public wf0(org.telegram.ui.pt0 pt0Var) {
        this.f32741a = pt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new jm(this, Integer.parseInt(str), 3));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new uf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f32741a.G = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f32741a.F = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.pt0 pt0Var = this.f32741a;
        pt0Var.E = i10 * 1000;
        String str = pt0Var.f33066s;
        if (str != null) {
            xf0.a(pt0Var, str);
            pt0Var.f33066s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z4;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.pt0 pt0Var = this.f32741a;
        boolean z10 = pt0Var.D;
        boolean z11 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z4 = false;
        } else {
            z4 = true;
        }
        pt0Var.D = z4;
        pt0Var.b(z10);
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
        if (i10 == 3 && pt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new uf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new mh.n6(this, z11, i10, 1));
    }
}
