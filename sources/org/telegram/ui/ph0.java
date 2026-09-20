package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ph0 implements Runnable {
    public final ai0 f36569a;

    public ph0(ai0 ai0Var) {
        this.f36569a = ai0Var;
    }

    @Override
    public final void run() {
        ai0 ai0Var = this.f36569a;
        if (ai0Var.f32073b == null) {
            return;
        }
        for (int i10 = 0; i10 < ai0Var.f32073b.getChildCount(); i10++) {
            View childAt = ai0Var.f32073b.getChildAt(i10);
            if (childAt instanceof xh0) {
                xh0 xh0Var = (xh0) childAt;
                if (xh0Var.I) {
                    xh0Var.b(xh0Var.f39581n, xh0Var.f39582r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
