package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u2 extends AnimatorListenerAdapter {
    public final int f25719a;
    public final v2 f25720b;

    public u2(v2 v2Var, int i10) {
        this.f25719a = i10;
        this.f25720b = v2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25719a) {
            case 0:
                v2 v2Var = this.f25720b;
                Runnable runnable = v2Var.f25822b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == v2Var.f25824e) {
                    v2Var.f25824e = null;
                    return;
                }
                return;
            default:
                v2 v2Var2 = this.f25720b;
                Runnable runnable2 = v2Var2.f25822b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == v2Var2.f25824e) {
                    v2Var2.f25824e = null;
                    return;
                }
                return;
        }
    }
}
