package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w50 extends AnimatorListenerAdapter {
    public final int f32553a;
    public final t60 f32554b;

    public w50(t60 t60Var, int i10) {
        this.f32553a = i10;
        this.f32554b = t60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32553a) {
            case 0:
                t60 t60Var = this.f32554b;
                if (animator.equals(t60Var.L)) {
                    t60Var.L = null;
                    return;
                }
                return;
            case 1:
                t60 t60Var2 = this.f32554b;
                if (t60Var2.l1 != null) {
                    t60Var2.l1 = null;
                    return;
                }
                return;
            default:
                t60 t60Var3 = this.f32554b;
                if (animator.equals(t60Var3.f31010e0)) {
                    t60Var3.c(true);
                    t60Var3.f31016g1 = false;
                    t60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
