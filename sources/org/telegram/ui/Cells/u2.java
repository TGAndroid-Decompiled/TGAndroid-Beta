package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u2 extends AnimatorListenerAdapter {
    public final int f25473a;
    public final v2 f25474b;

    public u2(v2 v2Var, int i10) {
        this.f25473a = i10;
        this.f25474b = v2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25473a) {
            case 0:
                v2 v2Var = this.f25474b;
                Runnable runnable = v2Var.f25575b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == v2Var.e) {
                    v2Var.e = null;
                    return;
                }
                return;
            default:
                v2 v2Var2 = this.f25474b;
                Runnable runnable2 = v2Var2.f25575b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == v2Var2.e) {
                    v2Var2.e = null;
                    return;
                }
                return;
        }
    }
}
