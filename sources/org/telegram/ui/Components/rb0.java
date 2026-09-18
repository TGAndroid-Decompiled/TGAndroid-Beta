package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class rb0 implements Runnable {
    public final int f27870a;
    public final sb0 f27871b;

    public rb0(sb0 sb0Var, int i10) {
        this.f27870a = i10;
        this.f27871b = sb0Var;
    }

    @Override
    public final void run() {
        switch (this.f27870a) {
            case 0:
                sb0 sb0Var = this.f27871b;
                if (sb0Var.W != -1) {
                    NotificationCenter.getInstance(sb0Var.Y.f30537c0.f23851w).onAnimationFinish(sb0Var.W);
                    sb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f27871b.Y.h();
                return;
            default:
                sb0 sb0Var2 = this.f27871b;
                if (sb0Var2.W != -1) {
                    NotificationCenter.getInstance(sb0Var2.Y.f30537c0.f23851w).onAnimationFinish(sb0Var2.W);
                    sb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
