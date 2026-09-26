package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class tb0 implements Runnable {
    public final int f28464a;
    public final ub0 f28465b;

    public tb0(ub0 ub0Var, int i10) {
        this.f28464a = i10;
        this.f28465b = ub0Var;
    }

    @Override
    public final void run() {
        switch (this.f28464a) {
            case 0:
                ub0 ub0Var = this.f28465b;
                if (ub0Var.W != -1) {
                    NotificationCenter.getInstance(ub0Var.Y.f30839c0.f24146w).onAnimationFinish(ub0Var.W);
                    ub0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28465b.Y.h();
                return;
            default:
                ub0 ub0Var2 = this.f28465b;
                if (ub0Var2.W != -1) {
                    NotificationCenter.getInstance(ub0Var2.Y.f30839c0.f24146w).onAnimationFinish(ub0Var2.W);
                    ub0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
