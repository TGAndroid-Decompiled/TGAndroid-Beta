package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f22734a;
    public final y2 f22735b;

    public x2(y2 y2Var, int i10) {
        this.f22734a = i10;
        this.f22735b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22734a) {
            case 0:
                y2 y2Var = this.f22735b;
                Runnable runnable = y2Var.f22768b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.e) {
                    y2Var.e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f22735b;
                Runnable runnable2 = y2Var2.f22768b;
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
