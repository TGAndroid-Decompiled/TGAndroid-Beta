package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class nc0 implements Runnable {
    public final int f28777a;
    public final oc0 f28778b;

    public nc0(oc0 oc0Var, int i10) {
        this.f28777a = i10;
        this.f28778b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f28777a) {
            case 0:
                oc0 oc0Var = this.f28778b;
                if (oc0Var.W != -1) {
                    NotificationCenter.getInstance(oc0Var.Y.f30856c0.f33332w).onAnimationFinish(oc0Var.W);
                    oc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28778b.Y.h();
                return;
            default:
                oc0 oc0Var2 = this.f28778b;
                if (oc0Var2.W != -1) {
                    NotificationCenter.getInstance(oc0Var2.Y.f30856c0.f33332w).onAnimationFinish(oc0Var2.W);
                    oc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
