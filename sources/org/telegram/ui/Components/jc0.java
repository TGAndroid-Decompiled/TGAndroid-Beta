package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class jc0 implements Runnable {
    public final int f27709a;
    public final kc0 f27710b;

    public jc0(kc0 kc0Var, int i10) {
        this.f27709a = i10;
        this.f27710b = kc0Var;
    }

    @Override
    public final void run() {
        switch (this.f27709a) {
            case 0:
                kc0 kc0Var = this.f27710b;
                if (kc0Var.W != -1) {
                    NotificationCenter.getInstance(kc0Var.Y.f29848c0.f31859w).onAnimationFinish(kc0Var.W);
                    kc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f27710b.Y.h();
                return;
            default:
                kc0 kc0Var2 = this.f27710b;
                if (kc0Var2.W != -1) {
                    NotificationCenter.getInstance(kc0Var2.Y.f29848c0.f31859w).onAnimationFinish(kc0Var2.W);
                    kc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
