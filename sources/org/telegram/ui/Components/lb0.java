package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class lb0 implements Runnable {
    public final int f28685a;
    public final mb0 f28686b;

    public lb0(mb0 mb0Var, int i10) {
        this.f28685a = i10;
        this.f28686b = mb0Var;
    }

    @Override
    public final void run() {
        switch (this.f28685a) {
            case 0:
                mb0 mb0Var = this.f28686b;
                if (mb0Var.W != -1) {
                    NotificationCenter.getInstance(mb0Var.Y.W.f33440w).onAnimationFinish(mb0Var.W);
                    mb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28686b.Y.h();
                return;
            default:
                mb0 mb0Var2 = this.f28686b;
                if (mb0Var2.W != -1) {
                    NotificationCenter.getInstance(mb0Var2.Y.W.f33440w).onAnimationFinish(mb0Var2.W);
                    mb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
