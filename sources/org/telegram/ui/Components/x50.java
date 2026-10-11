package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x50 extends AnimatorListenerAdapter {
    public final int f32871a;
    public final t60 f32872b;

    public x50(t60 t60Var, int i10) {
        this.f32871a = i10;
        this.f32872b = t60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32871a) {
            case 0:
                t60 t60Var = this.f32872b;
                if (animator.equals(t60Var.L)) {
                    t60Var.L = null;
                    return;
                }
                return;
            case 1:
                t60 t60Var2 = this.f32872b;
                if (t60Var2.l1 != null) {
                    t60Var2.l1 = null;
                    return;
                }
                return;
            default:
                t60 t60Var3 = this.f32872b;
                if (animator.equals(t60Var3.f31090e0)) {
                    t60Var3.c(true);
                    t60Var3.f31096g1 = false;
                    t60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
