package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lh0 implements Runnable {
    public final wh0 f38325a;

    public lh0(wh0 wh0Var) {
        this.f38325a = wh0Var;
    }

    @Override
    public final void run() {
        wh0 wh0Var = this.f38325a;
        if (wh0Var.f42531b == null) {
            return;
        }
        for (int i10 = 0; i10 < wh0Var.f42531b.getChildCount(); i10++) {
            View childAt = wh0Var.f42531b.getChildAt(i10);
            if (childAt instanceof th0) {
                th0 th0Var = (th0) childAt;
                if (th0Var.I) {
                    th0Var.b(th0Var.f40908n, th0Var.f40909r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
