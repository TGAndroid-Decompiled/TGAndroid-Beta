package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class kc0 implements Runnable {
    public final int f27923a;
    public final lc0 f27924b;

    public kc0(lc0 lc0Var, int i10) {
        this.f27923a = i10;
        this.f27924b = lc0Var;
    }

    @Override
    public final void run() {
        switch (this.f27923a) {
            case 0:
                lc0 lc0Var = this.f27924b;
                if (lc0Var.W != -1) {
                    NotificationCenter.getInstance(lc0Var.Y.f30132c0.f32620w).onAnimationFinish(lc0Var.W);
                    lc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f27924b.Y.h();
                return;
            default:
                lc0 lc0Var2 = this.f27924b;
                if (lc0Var2.W != -1) {
                    NotificationCenter.getInstance(lc0Var2.Y.f30132c0.f32620w).onAnimationFinish(lc0Var2.W);
                    lc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
