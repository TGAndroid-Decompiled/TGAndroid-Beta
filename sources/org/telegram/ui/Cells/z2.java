package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f32500a;
    public final a3 f32501b;

    public z2(a3 a3Var, int i7) {
        this.f32500a = i7;
        this.f32501b = a3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32500a) {
            case 0:
                a3 a3Var = this.f32501b;
                Runnable runnable = a3Var.f30365b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == a3Var.f30367e) {
                    a3Var.f30367e = null;
                    return;
                }
                return;
            default:
                a3 a3Var2 = this.f32501b;
                Runnable runnable2 = a3Var2.f30365b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == a3Var2.f30367e) {
                    a3Var2.f30367e = null;
                    return;
                }
                return;
        }
    }
}
