package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class cc0 implements Runnable {
    public final int f25166a;
    public final dc0 f25167b;

    public cc0(dc0 dc0Var, int i10) {
        this.f25166a = i10;
        this.f25167b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f25166a) {
            case 0:
                dc0 dc0Var = this.f25167b;
                if (dc0Var.W != -1) {
                    NotificationCenter.getInstance(dc0Var.Y.f27200c0.f28954w).onAnimationFinish(dc0Var.W);
                    dc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f25167b.Y.i();
                return;
            default:
                dc0 dc0Var2 = this.f25167b;
                if (dc0Var2.W != -1) {
                    NotificationCenter.getInstance(dc0Var2.Y.f27200c0.f28954w).onAnimationFinish(dc0Var2.W);
                    dc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
