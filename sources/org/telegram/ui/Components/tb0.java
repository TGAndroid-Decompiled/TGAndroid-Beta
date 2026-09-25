package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class tb0 implements Runnable {
    public final int f28465a;
    public final ub0 f28466b;

    public tb0(ub0 ub0Var, int i10) {
        this.f28465a = i10;
        this.f28466b = ub0Var;
    }

    @Override
    public final void run() {
        switch (this.f28465a) {
            case 0:
                ub0 ub0Var = this.f28466b;
                if (ub0Var.W != -1) {
                    NotificationCenter.getInstance(ub0Var.Y.f30840c0.f24147w).onAnimationFinish(ub0Var.W);
                    ub0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28466b.Y.h();
                return;
            default:
                ub0 ub0Var2 = this.f28466b;
                if (ub0Var2.W != -1) {
                    NotificationCenter.getInstance(ub0Var2.Y.f30840c0.f24147w).onAnimationFinish(ub0Var2.W);
                    ub0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
