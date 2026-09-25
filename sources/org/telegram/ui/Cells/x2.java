package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f21840a;
    public final y2 f21841b;

    public x2(y2 y2Var, int i10) {
        this.f21840a = i10;
        this.f21841b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21840a) {
            case 0:
                y2 y2Var = this.f21841b;
                Runnable runnable = y2Var.f21868b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.e) {
                    y2Var.e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f21841b;
                Runnable runnable2 = y2Var2.f21868b;
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
