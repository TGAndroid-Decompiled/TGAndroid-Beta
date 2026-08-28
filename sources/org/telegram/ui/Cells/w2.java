package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f25887a;
    public final x2 f25888b;

    public w2(x2 x2Var, int i9) {
        this.f25887a = i9;
        this.f25888b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25887a) {
            case 0:
                x2 x2Var = this.f25888b;
                Runnable runnable = x2Var.f25931b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.f25933e) {
                    x2Var.f25933e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f25888b;
                Runnable runnable2 = x2Var2.f25931b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.f25933e) {
                    x2Var2.f25933e = null;
                    return;
                }
                return;
        }
    }
}
