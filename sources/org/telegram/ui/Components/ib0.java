package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class ib0 implements Runnable {
    public final int f24920a;
    public final jb0 f24921b;

    public ib0(jb0 jb0Var, int i10) {
        this.f24920a = i10;
        this.f24921b = jb0Var;
    }

    @Override
    public final void run() {
        switch (this.f24920a) {
            case 0:
                jb0 jb0Var = this.f24921b;
                if (jb0Var.W != -1) {
                    NotificationCenter.getInstance(jb0Var.Y.f26988c0.f28678w).onAnimationFinish(jb0Var.W);
                    jb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f24921b.Y.h();
                return;
            default:
                jb0 jb0Var2 = this.f24921b;
                if (jb0Var2.W != -1) {
                    NotificationCenter.getInstance(jb0Var2.Y.f26988c0.f28678w).onAnimationFinish(jb0Var2.W);
                    jb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
