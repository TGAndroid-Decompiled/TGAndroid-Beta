package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f22430a;
    public final y2 f22431b;

    public x2(y2 y2Var, int i10) {
        this.f22430a = i10;
        this.f22431b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22430a) {
            case 0:
                y2 y2Var = this.f22431b;
                Runnable runnable = y2Var.f22467b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.e) {
                    y2Var.e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f22431b;
                Runnable runnable2 = y2Var2.f22467b;
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
