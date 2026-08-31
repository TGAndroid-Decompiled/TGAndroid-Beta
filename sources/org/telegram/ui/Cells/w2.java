package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f24345a;
    public final x2 f24346b;

    public w2(x2 x2Var, int i10) {
        this.f24345a = i10;
        this.f24346b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24345a) {
            case 0:
                x2 x2Var = this.f24346b;
                Runnable runnable = x2Var.f24391b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.f24393e) {
                    x2Var.f24393e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f24346b;
                Runnable runnable2 = x2Var2.f24391b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.f24393e) {
                    x2Var2.f24393e = null;
                    return;
                }
                return;
        }
    }
}
