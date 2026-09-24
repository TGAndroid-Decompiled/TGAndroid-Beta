package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class tb0 implements Runnable {
    public final int f28458a;
    public final ub0 f28459b;

    public tb0(ub0 ub0Var, int i10) {
        this.f28458a = i10;
        this.f28459b = ub0Var;
    }

    @Override
    public final void run() {
        switch (this.f28458a) {
            case 0:
                ub0 ub0Var = this.f28459b;
                if (ub0Var.W != -1) {
                    NotificationCenter.getInstance(ub0Var.Y.f30829c0.f24140w).onAnimationFinish(ub0Var.W);
                    ub0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28459b.Y.h();
                return;
            default:
                ub0 ub0Var2 = this.f28459b;
                if (ub0Var2.W != -1) {
                    NotificationCenter.getInstance(ub0Var2.Y.f30829c0.f24140w).onAnimationFinish(ub0Var2.W);
                    ub0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
