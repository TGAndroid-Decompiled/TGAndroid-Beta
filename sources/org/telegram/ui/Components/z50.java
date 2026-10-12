package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z50 extends AnimatorListenerAdapter {
    public final int f33283a;
    public final w60 f33284b;

    public z50(w60 w60Var, int i10) {
        this.f33283a = i10;
        this.f33284b = w60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33283a) {
            case 0:
                w60 w60Var = this.f33284b;
                if (animator.equals(w60Var.L)) {
                    w60Var.L = null;
                    return;
                }
                return;
            case 1:
                w60 w60Var2 = this.f33284b;
                if (w60Var2.l1 != null) {
                    w60Var2.l1 = null;
                    return;
                }
                return;
            default:
                w60 w60Var3 = this.f33284b;
                if (animator.equals(w60Var3.f32295e0)) {
                    w60Var3.c(true);
                    w60Var3.f32301g1 = false;
                    w60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
