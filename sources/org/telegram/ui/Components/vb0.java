package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class vb0 implements Runnable {
    public final int f31626a;
    public final wb0 f31627b;

    public vb0(wb0 wb0Var, int i10) {
        this.f31626a = i10;
        this.f31627b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f31626a) {
            case 0:
                wb0 wb0Var = this.f31627b;
                if (wb0Var.W != -1) {
                    NotificationCenter.getInstance(wb0Var.Y.f25320c0.f27363w).onAnimationFinish(wb0Var.W);
                    wb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f31627b.Y.h();
                return;
            default:
                wb0 wb0Var2 = this.f31627b;
                if (wb0Var2.W != -1) {
                    NotificationCenter.getInstance(wb0Var2.Y.f25320c0.f27363w).onAnimationFinish(wb0Var2.W);
                    wb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
