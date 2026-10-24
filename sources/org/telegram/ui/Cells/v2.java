package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v2 extends AnimatorListenerAdapter {
    public final int f23833a;
    public final w2 f23834b;

    public v2(w2 w2Var, int i10) {
        this.f23833a = i10;
        this.f23834b = w2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23833a) {
            case 0:
                w2 w2Var = this.f23834b;
                Runnable runnable = w2Var.f23898b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == w2Var.e) {
                    w2Var.e = null;
                    return;
                }
                return;
            default:
                w2 w2Var2 = this.f23834b;
                Runnable runnable2 = w2Var2.f23898b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == w2Var2.e) {
                    w2Var2.e = null;
                    return;
                }
                return;
        }
    }
}
