package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f32534a;
    public final a3 f32535b;

    public z2(a3 a3Var, int i7) {
        this.f32534a = i7;
        this.f32535b = a3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32534a) {
            case 0:
                a3 a3Var = this.f32535b;
                Runnable runnable = a3Var.f30399b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == a3Var.f30401e) {
                    a3Var.f30401e = null;
                    return;
                }
                return;
            default:
                a3 a3Var2 = this.f32535b;
                Runnable runnable2 = a3Var2.f30399b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == a3Var2.f30401e) {
                    a3Var2.f30401e = null;
                    return;
                }
                return;
        }
    }
}
