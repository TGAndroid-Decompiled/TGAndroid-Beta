package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lh0 implements Runnable {
    public final wh0 f38268a;

    public lh0(wh0 wh0Var) {
        this.f38268a = wh0Var;
    }

    @Override
    public final void run() {
        wh0 wh0Var = this.f38268a;
        if (wh0Var.f42468b == null) {
            return;
        }
        for (int i10 = 0; i10 < wh0Var.f42468b.getChildCount(); i10++) {
            View childAt = wh0Var.f42468b.getChildAt(i10);
            if (childAt instanceof th0) {
                th0 th0Var = (th0) childAt;
                if (th0Var.I) {
                    th0Var.b(th0Var.f40840n, th0Var.f40841r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
