package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class kb0 implements Runnable {
    public final int f26250a;
    public final lb0 f26251b;

    public kb0(lb0 lb0Var, int i10) {
        this.f26250a = i10;
        this.f26251b = lb0Var;
    }

    @Override
    public final void run() {
        switch (this.f26250a) {
            case 0:
                lb0 lb0Var = this.f26251b;
                if (lb0Var.W != -1) {
                    NotificationCenter.getInstance(lb0Var.Y.W.f30580w).onAnimationFinish(lb0Var.W);
                    lb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f26251b.Y.h();
                return;
            default:
                lb0 lb0Var2 = this.f26251b;
                if (lb0Var2.W != -1) {
                    NotificationCenter.getInstance(lb0Var2.Y.W.f30580w).onAnimationFinish(lb0Var2.W);
                    lb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
