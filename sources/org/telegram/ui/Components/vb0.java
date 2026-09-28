package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class vb0 implements Runnable {
    public final int f29034a;
    public final wb0 f29035b;

    public vb0(wb0 wb0Var, int i10) {
        this.f29034a = i10;
        this.f29035b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f29034a) {
            case 0:
                wb0 wb0Var = this.f29035b;
                if (wb0Var.W != -1) {
                    NotificationCenter.getInstance(wb0Var.Y.f22950c0.f24778w).onAnimationFinish(wb0Var.W);
                    wb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f29035b.Y.h();
                return;
            default:
                wb0 wb0Var2 = this.f29035b;
                if (wb0Var2.W != -1) {
                    NotificationCenter.getInstance(wb0Var2.Y.f22950c0.f24778w).onAnimationFinish(wb0Var2.W);
                    wb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
