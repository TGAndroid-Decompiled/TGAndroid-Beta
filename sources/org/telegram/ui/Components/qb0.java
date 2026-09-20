package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class qb0 implements Runnable {
    public final int f27558a;
    public final rb0 f27559b;

    public qb0(rb0 rb0Var, int i10) {
        this.f27558a = i10;
        this.f27559b = rb0Var;
    }

    @Override
    public final void run() {
        switch (this.f27558a) {
            case 0:
                rb0 rb0Var = this.f27559b;
                if (rb0Var.W != -1) {
                    NotificationCenter.getInstance(rb0Var.Y.f30229c0.f23557w).onAnimationFinish(rb0Var.W);
                    rb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f27559b.Y.h();
                return;
            default:
                rb0 rb0Var2 = this.f27559b;
                if (rb0Var2.W != -1) {
                    NotificationCenter.getInstance(rb0Var2.Y.f30229c0.f23557w).onAnimationFinish(rb0Var2.W);
                    rb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
