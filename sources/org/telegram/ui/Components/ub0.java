package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class ub0 implements Runnable {
    public final int f28755a;
    public final vb0 f28756b;

    public ub0(vb0 vb0Var, int i10) {
        this.f28755a = i10;
        this.f28756b = vb0Var;
    }

    @Override
    public final void run() {
        switch (this.f28755a) {
            case 0:
                vb0 vb0Var = this.f28756b;
                if (vb0Var.W != -1) {
                    NotificationCenter.getInstance(vb0Var.Y.f22606c0.f24469w).onAnimationFinish(vb0Var.W);
                    vb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28756b.Y.h();
                return;
            default:
                vb0 vb0Var2 = this.f28756b;
                if (vb0Var2.W != -1) {
                    NotificationCenter.getInstance(vb0Var2.Y.f22606c0.f24469w).onAnimationFinish(vb0Var2.W);
                    vb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
