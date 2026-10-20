package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f23758a;
    public final x2 f23759b;

    public w2(x2 x2Var, int i10) {
        this.f23758a = i10;
        this.f23759b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23758a) {
            case 0:
                x2 x2Var = this.f23759b;
                Runnable runnable = x2Var.f23792b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.e) {
                    x2Var.e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f23759b;
                Runnable runnable2 = x2Var2.f23792b;
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
