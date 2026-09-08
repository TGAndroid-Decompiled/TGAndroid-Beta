package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f23492a;
    public final x2 f23493b;

    public w2(x2 x2Var, int i10) {
        this.f23492a = i10;
        this.f23493b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23492a) {
            case 0:
                x2 x2Var = this.f23493b;
                Runnable runnable = x2Var.f23545b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.f23547e) {
                    x2Var.f23547e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f23493b;
                Runnable runnable2 = x2Var2.f23545b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.f23547e) {
                    x2Var2.f23547e = null;
                    return;
                }
                return;
        }
    }
}
