package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class cc0 implements Runnable {
    public final int f25190a;
    public final dc0 f25191b;

    public cc0(dc0 dc0Var, int i10) {
        this.f25190a = i10;
        this.f25191b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f25190a) {
            case 0:
                dc0 dc0Var = this.f25191b;
                if (dc0Var.W != -1) {
                    NotificationCenter.getInstance(dc0Var.Y.f27185c0.f28928w).onAnimationFinish(dc0Var.W);
                    dc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f25191b.Y.i();
                return;
            default:
                dc0 dc0Var2 = this.f25191b;
                if (dc0Var2.W != -1) {
                    NotificationCenter.getInstance(dc0Var2.Y.f27185c0.f28928w).onAnimationFinish(dc0Var2.W);
                    dc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
