package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f23481a;
    public final y2 f23482b;

    public x2(y2 y2Var, int i10) {
        this.f23481a = i10;
        this.f23482b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23481a) {
            case 0:
                y2 y2Var = this.f23482b;
                Runnable runnable = y2Var.f23523b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.f23525e) {
                    y2Var.f23525e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f23482b;
                Runnable runnable2 = y2Var2.f23523b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == y2Var2.f23525e) {
                    y2Var2.f23525e = null;
                    return;
                }
                return;
        }
    }
}
