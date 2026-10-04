package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f23723a;
    public final y2 f23724b;

    public x2(y2 y2Var, int i10) {
        this.f23723a = i10;
        this.f23724b = y2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23723a) {
            case 0:
                y2 y2Var = this.f23724b;
                Runnable runnable = y2Var.f23754b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.f23756e) {
                    y2Var.f23756e = null;
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f23724b;
                Runnable runnable2 = y2Var2.f23754b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == y2Var2.f23756e) {
                    y2Var2.f23756e = null;
                    return;
                }
                return;
        }
    }
}
