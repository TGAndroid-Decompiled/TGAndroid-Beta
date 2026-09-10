package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class sb0 implements Runnable {
    public final int f26995a;
    public final tb0 f26996b;

    public sb0(tb0 tb0Var, int i10) {
        this.f26995a = i10;
        this.f26996b = tb0Var;
    }

    @Override
    public final void run() {
        switch (this.f26995a) {
            case 0:
                tb0 tb0Var = this.f26996b;
                if (tb0Var.W != -1) {
                    NotificationCenter.getInstance(tb0Var.Y.f29295c0.f22668w).onAnimationFinish(tb0Var.W);
                    tb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f26996b.Y.h();
                return;
            default:
                tb0 tb0Var2 = this.f26996b;
                if (tb0Var2.W != -1) {
                    NotificationCenter.getInstance(tb0Var2.Y.f29295c0.f22668w).onAnimationFinish(tb0Var2.W);
                    tb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
