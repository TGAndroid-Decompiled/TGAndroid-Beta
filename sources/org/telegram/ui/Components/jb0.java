package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class jb0 implements Runnable {
    public final int f27452a;
    public final kb0 f27453b;

    public jb0(kb0 kb0Var, int i10) {
        this.f27452a = i10;
        this.f27453b = kb0Var;
    }

    @Override
    public final void run() {
        switch (this.f27452a) {
            case 0:
                kb0 kb0Var = this.f27453b;
                if (kb0Var.W != -1) {
                    NotificationCenter.getInstance(kb0Var.Y.f29689c0.f32259w).onAnimationFinish(kb0Var.W);
                    kb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f27453b.Y.h();
                return;
            default:
                kb0 kb0Var2 = this.f27453b;
                if (kb0Var2.W != -1) {
                    NotificationCenter.getInstance(kb0Var2.Y.f29689c0.f32259w).onAnimationFinish(kb0Var2.W);
                    kb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
