package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class yf0 {
    public final org.telegram.ui.hu0 f29318a;

    public yf0(org.telegram.ui.hu0 hu0Var) {
        this.f29318a = hu0Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        AndroidUtilities.runOnUIThread(new zd(this, Integer.parseInt(str), 4));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        AndroidUtilities.runOnUIThread(new wf0(this, 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f7) {
        this.f29318a.J = f7;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i10) {
        this.f29318a.I = i10 * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i10) {
        org.telegram.ui.hu0 hu0Var = this.f29318a;
        hu0Var.H = i10 * 1000;
        String str = hu0Var.f29664s;
        if (str != null) {
            zf0.a(hu0Var, str);
            hu0Var.f29664s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        boolean z10;
        int parseInt = Integer.parseInt(str);
        org.telegram.ui.hu0 hu0Var = this.f29318a;
        boolean z11 = hu0Var.G;
        boolean z12 = false;
        int i10 = 1;
        if (parseInt != 1 && parseInt != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        hu0Var.G = z10;
        hu0Var.b(z11);
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
        if (i10 == 3 && hu0Var.h.getVisibility() != 4) {
            AndroidUtilities.runOnUIThread(new wf0(this, 1), 300L);
        }
        AndroidUtilities.runOnUIThread(new i2.f0(this, z12, i10, 1));
    }
}
