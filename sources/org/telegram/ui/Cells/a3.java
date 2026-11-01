package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f21666a;
    public final b3 f21667b;

    public a3(b3 b3Var, int i10) {
        this.f21666a = i10;
        this.f21667b = b3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21666a) {
            case 0:
                b3 b3Var = this.f21667b;
                Runnable runnable = b3Var.f21712b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == b3Var.e) {
                    b3Var.e = null;
                    return;
                }
                return;
            default:
                b3 b3Var2 = this.f21667b;
                Runnable runnable2 = b3Var2.f21712b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == b3Var2.e) {
                    b3Var2.e = null;
                    return;
                }
                return;
        }
    }
}
