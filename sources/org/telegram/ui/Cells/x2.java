package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f21842a;
    public final y2 f21843b;

    public x2(y2 y2Var, int i10) {
        this.f21842a = i10;
        this.f21843b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21842a) {
            case 0:
                y2 y2Var = this.f21843b;
                Runnable runnable = y2Var.f21870b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.e) {
                    y2Var.e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f21843b;
                Runnable runnable2 = y2Var2.f21870b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == y2Var2.e) {
                    y2Var2.e = null;
                    return;
                }
                return;
        }
    }
}
