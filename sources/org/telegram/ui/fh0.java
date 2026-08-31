package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fh0 implements Runnable {
    public final qh0 f36885a;

    public fh0(qh0 qh0Var) {
        this.f36885a = qh0Var;
    }

    @Override
    public final void run() {
        qh0 qh0Var = this.f36885a;
        if (qh0Var.f40502b == null) {
            return;
        }
        for (int i10 = 0; i10 < qh0Var.f40502b.getChildCount(); i10++) {
            View childAt = qh0Var.f40502b.getChildAt(i10);
            if (childAt instanceof nh0) {
                nh0 nh0Var = (nh0) childAt;
                if (nh0Var.F) {
                    nh0Var.b(nh0Var.f39453n, nh0Var.f39454r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
