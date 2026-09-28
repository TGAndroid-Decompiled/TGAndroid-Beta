package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f21839a;
    public final y2 f21840b;

    public x2(y2 y2Var, int i10) {
        this.f21839a = i10;
        this.f21840b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21839a) {
            case 0:
                y2 y2Var = this.f21840b;
                Runnable runnable = y2Var.f21867b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.e) {
                    y2Var.e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f21840b;
                Runnable runnable2 = y2Var2.f21867b;
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
