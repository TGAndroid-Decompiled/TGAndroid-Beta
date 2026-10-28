package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class cc0 implements Runnable {
    public final int f27123a;
    public final dc0 f27124b;

    public cc0(dc0 dc0Var, int i10) {
        this.f27123a = i10;
        this.f27124b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f27123a) {
            case 0:
                dc0 dc0Var = this.f27124b;
                if (dc0Var.W != -1) {
                    NotificationCenter.getInstance(dc0Var.Y.f29306c0.f31270w).onAnimationFinish(dc0Var.W);
                    dc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f27124b.Y.i();
                return;
            default:
                dc0 dc0Var2 = this.f27124b;
                if (dc0Var2.W != -1) {
                    NotificationCenter.getInstance(dc0Var2.Y.f29306c0.f31270w).onAnimationFinish(dc0Var2.W);
                    dc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
