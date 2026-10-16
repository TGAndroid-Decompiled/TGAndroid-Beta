package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class ic0 implements Runnable {
    public final int f25628a;
    public final jc0 f25629b;

    public ic0(jc0 jc0Var, int i10) {
        this.f25628a = i10;
        this.f25629b = jc0Var;
    }

    @Override
    public final void run() {
        switch (this.f25628a) {
            case 0:
                jc0 jc0Var = this.f25629b;
                if (jc0Var.W != -1) {
                    NotificationCenter.getInstance(jc0Var.Y.f27967c0.f29625w).onAnimationFinish(jc0Var.W);
                    jc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f25629b.Y.h();
                return;
            default:
                jc0 jc0Var2 = this.f25629b;
                if (jc0Var2.W != -1) {
                    NotificationCenter.getInstance(jc0Var2.Y.f27967c0.f29625w).onAnimationFinish(jc0Var2.W);
                    jc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
