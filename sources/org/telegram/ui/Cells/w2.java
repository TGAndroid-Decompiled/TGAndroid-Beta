package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f21575a;
    public final x2 f21576b;

    public w2(x2 x2Var, int i10) {
        this.f21575a = i10;
        this.f21576b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21575a) {
            case 0:
                x2 x2Var = this.f21576b;
                Runnable runnable = x2Var.f21622b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.e) {
                    x2Var.e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f21576b;
                Runnable runnable2 = x2Var2.f21622b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.e) {
                    x2Var2.e = null;
                    return;
                }
                return;
        }
    }
}
