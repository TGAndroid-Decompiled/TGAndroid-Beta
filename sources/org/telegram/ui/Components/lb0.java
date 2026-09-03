package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class lb0 implements Runnable {
    public final int f28708a;
    public final mb0 f28709b;

    public lb0(mb0 mb0Var, int i10) {
        this.f28708a = i10;
        this.f28709b = mb0Var;
    }

    @Override
    public final void run() {
        switch (this.f28708a) {
            case 0:
                mb0 mb0Var = this.f28709b;
                if (mb0Var.W != -1) {
                    NotificationCenter.getInstance(mb0Var.Y.W.f33461w).onAnimationFinish(mb0Var.W);
                    mb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28709b.Y.h();
                return;
            default:
                mb0 mb0Var2 = this.f28709b;
                if (mb0Var2.W != -1) {
                    NotificationCenter.getInstance(mb0Var2.Y.W.f33461w).onAnimationFinish(mb0Var2.W);
                    mb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
