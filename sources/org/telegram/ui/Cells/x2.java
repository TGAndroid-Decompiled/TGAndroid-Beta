package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f21825a;
    public final y2 f21826b;

    public x2(y2 y2Var, int i10) {
        this.f21825a = i10;
        this.f21826b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21825a) {
            case 0:
                y2 y2Var = this.f21826b;
                Runnable runnable = y2Var.f21853b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.e) {
                    y2Var.e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f21826b;
                Runnable runnable2 = y2Var2.f21853b;
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
