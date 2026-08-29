package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class fb0 implements Runnable {
    public final int f28368a;
    public final gb0 f28369b;

    public fb0(gb0 gb0Var, int i10) {
        this.f28368a = i10;
        this.f28369b = gb0Var;
    }

    @Override
    public final void run() {
        switch (this.f28368a) {
            case 0:
                gb0 gb0Var = this.f28369b;
                if (gb0Var.W != -1) {
                    NotificationCenter.getInstance(gb0Var.Y.V.f32257w).onAnimationFinish(gb0Var.W);
                    gb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f28369b.Y.h();
                return;
            default:
                gb0 gb0Var2 = this.f28369b;
                if (gb0Var2.W != -1) {
                    NotificationCenter.getInstance(gb0Var2.Y.V.f32257w).onAnimationFinish(gb0Var2.W);
                    gb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
