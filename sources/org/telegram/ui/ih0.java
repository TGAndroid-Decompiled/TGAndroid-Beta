package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ih0 implements Runnable {
    public final th0 f34142a;

    public ih0(th0 th0Var) {
        this.f34142a = th0Var;
    }

    @Override
    public final void run() {
        th0 th0Var = this.f34142a;
        if (th0Var.f37657b == null) {
            return;
        }
        for (int i10 = 0; i10 < th0Var.f37657b.getChildCount(); i10++) {
            View childAt = th0Var.f37657b.getChildAt(i10);
            if (childAt instanceof qh0) {
                qh0 qh0Var = (qh0) childAt;
                if (qh0Var.I) {
                    qh0Var.b(qh0Var.f36445n, qh0Var.f36446r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
