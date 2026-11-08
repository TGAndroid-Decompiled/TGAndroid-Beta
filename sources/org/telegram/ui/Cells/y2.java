package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f30919a;
    public final z2 f30920b;

    public y2(z2 z2Var, int i7) {
        this.f30919a = i7;
        this.f30920b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30919a) {
            case 0:
                z2 z2Var = this.f30920b;
                Runnable runnable = z2Var.f30956b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.f30958e) {
                    z2Var.f30958e = null;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30920b;
                Runnable runnable2 = z2Var2.f30956b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.f30958e) {
                    z2Var2.f30958e = null;
                    return;
                }
                return;
        }
    }
}
