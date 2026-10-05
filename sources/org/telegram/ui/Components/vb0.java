package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class vb0 implements Runnable {
    public final int f31700a;
    public final wb0 f31701b;

    public vb0(wb0 wb0Var, int i10) {
        this.f31700a = i10;
        this.f31701b = wb0Var;
    }

    @Override
    public final void run() {
        switch (this.f31700a) {
            case 0:
                wb0 wb0Var = this.f31701b;
                if (wb0Var.W != -1) {
                    NotificationCenter.getInstance(wb0Var.Y.f25374c0.f27464w).onAnimationFinish(wb0Var.W);
                    wb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f31701b.Y.h();
                return;
            default:
                wb0 wb0Var2 = this.f31701b;
                if (wb0Var2.W != -1) {
                    NotificationCenter.getInstance(wb0Var2.Y.f25374c0.f27464w).onAnimationFinish(wb0Var2.W);
                    wb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
