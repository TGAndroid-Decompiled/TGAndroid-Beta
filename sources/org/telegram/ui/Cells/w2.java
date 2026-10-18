package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f23754a;
    public final x2 f23755b;

    public w2(x2 x2Var, int i10) {
        this.f23754a = i10;
        this.f23755b = x2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23754a) {
            case 0:
                x2 x2Var = this.f23755b;
                Runnable runnable = x2Var.f23788b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.e) {
                    x2Var.e = null;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f23755b;
                Runnable runnable2 = x2Var2.f23788b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.e) {
                    x2Var2.e = null;
                    return;
                }
                return;
        }
    }
}
