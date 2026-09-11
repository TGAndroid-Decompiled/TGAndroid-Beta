package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f23465a;
    public final x2 f23466b;

    public w2(x2 x2Var, int i10) {
        this.f23465a = i10;
        this.f23466b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23465a) {
            case 0:
                x2 x2Var = this.f23466b;
                Runnable runnable = x2Var.f23518b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.f23520e) {
                    x2Var.f23520e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f23466b;
                Runnable runnable2 = x2Var2.f23518b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.f23520e) {
                    x2Var2.f23520e = null;
                    return;
                }
                return;
        }
    }
}
