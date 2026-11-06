package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f30915a;
    public final z2 f30916b;

    public y2(z2 z2Var, int i7) {
        this.f30915a = i7;
        this.f30916b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30915a) {
            case 0:
                z2 z2Var = this.f30916b;
                Runnable runnable = z2Var.f30952b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.f30954e) {
                    z2Var.f30954e = null;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30916b;
                Runnable runnable2 = z2Var2.f30952b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.f30954e) {
                    z2Var2.f30954e = null;
                    return;
                }
                return;
        }
    }
}
