package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class jg0 {
    public final org.telegram.ui.ot0 f27526a;

    public jg0(org.telegram.ui.ot0 ot0Var) {
        this.f27526a = ot0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new e2(this, Integer.parseInt(str), 9));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new hg0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f27526a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f27526a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.ot0 ot0Var = this.f27526a;
        ot0Var.H = i10 * 1000;
        String str = ot0Var.f27849s;
        if (str != null) {
            kg0.a(ot0Var, str);
            ot0Var.f27849s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.ot0 ot0Var = this.f27526a;
        boolean z11 = ot0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        ot0Var.G = z10;
        ot0Var.b(z11);
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
        if (i10 == 3 && ot0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new hg0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new ai.y8(this, z12, i10, 2));
    }
}
