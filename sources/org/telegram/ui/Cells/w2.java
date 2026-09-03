package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f24347a;
    public final x2 f24348b;

    public w2(x2 x2Var, int i10) {
        this.f24347a = i10;
        this.f24348b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24347a) {
            case 0:
                x2 x2Var = this.f24348b;
                Runnable runnable = x2Var.f24393b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.f24395e) {
                    x2Var.f24395e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f24348b;
                Runnable runnable2 = x2Var2.f24393b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.f24395e) {
                    x2Var2.f24395e = null;
                    return;
                }
                return;
        }
    }
}
