package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

public final class ua0 implements Runnable {

    public final int f33025a;

    public final va0 f33026b;

    public ua0(va0 va0Var, int i10) {
        this.f33025a = i10;
        this.f33026b = va0Var;
    }

    @Override
    public final void run() {
        switch (this.f33025a) {
            case 0:
                va0 va0Var = this.f33026b;
                if (va0Var.W != -1) {
                    NotificationCenter.getInstance(va0Var.Y.V.f28588w).onAnimationFinish(va0Var.W);
                    va0Var.W = -1;
                }
                break;
            case 1:
                this.f33026b.Y.h();
                break;
            default:
                va0 va0Var2 = this.f33026b;
                if (va0Var2.W != -1) {
                    NotificationCenter.getInstance(va0Var2.Y.V.f28588w).onAnimationFinish(va0Var2.W);
                    va0Var2.W = -1;
                }
                break;
        }
    }
}
