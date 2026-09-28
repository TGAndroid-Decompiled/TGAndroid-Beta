package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class vb0 implements Runnable {
    public final int f29035a;
    public final wb0 f29036b;

    public vb0(wb0 wb0Var, int i10) {
        this.f29035a = i10;
        this.f29036b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f29035a) {
            case 0:
                wb0 wb0Var = this.f29036b;
                if (wb0Var.W != -1) {
                    NotificationCenter.getInstance(wb0Var.Y.f22951c0.f24779w).onAnimationFinish(wb0Var.W);
                    wb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f29036b.Y.h();
                return;
            default:
                wb0 wb0Var2 = this.f29036b;
                if (wb0Var2.W != -1) {
                    NotificationCenter.getInstance(wb0Var2.Y.f22951c0.f24779w).onAnimationFinish(wb0Var2.W);
                    wb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
