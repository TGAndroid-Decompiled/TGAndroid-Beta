package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class ic0 implements Runnable {
    public final int f25933a;
    public final jc0 f25934b;

    public ic0(jc0 jc0Var, int i10) {
        this.f25933a = i10;
        this.f25934b = jc0Var;
    }

    @Override
    public final void run() {
        switch (this.f25933a) {
            case 0:
                jc0 jc0Var = this.f25934b;
                if (jc0Var.W != -1) {
                    NotificationCenter.getInstance(jc0Var.Y.f28286c0.f29940w).onAnimationFinish(jc0Var.W);
                    jc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f25934b.Y.h();
                return;
            default:
                jc0 jc0Var2 = this.f25934b;
                if (jc0Var2.W != -1) {
                    NotificationCenter.getInstance(jc0Var2.Y.f28286c0.f29940w).onAnimationFinish(jc0Var2.W);
                    jc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
