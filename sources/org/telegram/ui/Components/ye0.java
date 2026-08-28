package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ye0 {
    public final org.telegram.ui.gt0 f34958a;

    public ye0(org.telegram.ui.gt0 gt0Var) {
        this.f34958a = gt0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new qd(this, Integer.parseInt(str), 4));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new we0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f10) {
        this.f34958a.F = f10;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i9) {
        this.f34958a.E = i9 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i9) {
        org.telegram.ui.gt0 gt0Var = this.f34958a;
        gt0Var.D = i9 * 1000;
        String str = gt0Var.f35293s;
        if (str != null) {
            ze0.a(gt0Var, str);
            gt0Var.f35293s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.gt0 gt0Var = this.f34958a;
        boolean z11 = gt0Var.C;
        boolean z12 = false;
        int i9 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        gt0Var.C = z10;
        gt0Var.b(z11);
        if (parseInt != 0) {
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        z12 = true;
                        i9 = 2;
                    }
                }
            } else {
                z12 = true;
            }
            i9 = 3;
        } else {
            i9 = 4;
        }
        if (i9 == 3 && gt0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new we0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new gh.q6(this, z12, i9, 1));
    }
}
