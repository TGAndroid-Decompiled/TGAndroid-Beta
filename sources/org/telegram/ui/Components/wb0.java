package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class wb0 implements Runnable {
    public final int f29881a;
    public final xb0 f29882b;

    public wb0(xb0 xb0Var, int i10) {
        this.f29881a = i10;
        this.f29882b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f29881a) {
            case 0:
                xb0 xb0Var = this.f29882b;
                if (xb0Var.W != -1) {
                    NotificationCenter.getInstance(xb0Var.Y.f23264c0.f25078w).onAnimationFinish(xb0Var.W);
                    xb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f29882b.Y.h();
                return;
            default:
                xb0 xb0Var2 = this.f29882b;
                if (xb0Var2.W != -1) {
                    NotificationCenter.getInstance(xb0Var2.Y.f23264c0.f25078w).onAnimationFinish(xb0Var2.W);
                    xb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
