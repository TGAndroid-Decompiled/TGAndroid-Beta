package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class vb0 implements Runnable {
    public final int f29028a;
    public final wb0 f29029b;

    public vb0(wb0 wb0Var, int i10) {
        this.f29028a = i10;
        this.f29029b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f29028a) {
            case 0:
                wb0 wb0Var = this.f29029b;
                if (wb0Var.W != -1) {
                    NotificationCenter.getInstance(wb0Var.Y.f22938c0.f24779w).onAnimationFinish(wb0Var.W);
                    wb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f29029b.Y.h();
                return;
            default:
                wb0 wb0Var2 = this.f29029b;
                if (wb0Var2.W != -1) {
                    NotificationCenter.getInstance(wb0Var2.Y.f22938c0.f24779w).onAnimationFinish(wb0Var2.W);
                    wb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
