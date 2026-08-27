package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class u2 extends AnimatorListenerAdapter {

    public final int f25695a;

    public final v2 f25696b;

    public u2(v2 v2Var, int i10) {
        this.f25695a = i10;
        this.f25696b = v2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25695a) {
            case 0:
                v2 v2Var = this.f25696b;
                Runnable runnable = v2Var.f25792b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == v2Var.f25794e) {
                    v2Var.f25794e = null;
                }
                break;
            default:
                v2 v2Var2 = this.f25696b;
                Runnable runnable2 = v2Var2.f25792b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == v2Var2.f25794e) {
                    v2Var2.f25794e = null;
                }
                break;
        }
    }
}
