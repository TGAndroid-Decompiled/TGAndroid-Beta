package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class fc0 implements Runnable {
    public final int f26281a;
    public final gc0 f26282b;

    public fc0(gc0 gc0Var, int i10) {
        this.f26281a = i10;
        this.f26282b = gc0Var;
    }

    @Override
    public final void run() {
        switch (this.f26281a) {
            case 0:
                gc0 gc0Var = this.f26282b;
                if (gc0Var.W != -1) {
                    NotificationCenter.getInstance(gc0Var.Y.f28340c0.f30150w).onAnimationFinish(gc0Var.W);
                    gc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f26282b.Y.i();
                return;
            default:
                gc0 gc0Var2 = this.f26282b;
                if (gc0Var2.W != -1) {
                    NotificationCenter.getInstance(gc0Var2.Y.f28340c0.f30150w).onAnimationFinish(gc0Var2.W);
                    gc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
