package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f32588a;
    public final a3 f32589b;

    public z2(a3 a3Var, int i7) {
        this.f32588a = i7;
        this.f32589b = a3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32588a) {
            case 0:
                a3 a3Var = this.f32589b;
                Runnable runnable = a3Var.f30458b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == a3Var.f30460e) {
                    a3Var.f30460e = null;
                    return;
                }
                return;
            default:
                a3 a3Var2 = this.f32589b;
                Runnable runnable2 = a3Var2.f30458b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == a3Var2.f30460e) {
                    a3Var2.f30460e = null;
                    return;
                }
                return;
        }
    }
}
