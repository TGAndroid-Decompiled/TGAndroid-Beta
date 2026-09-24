package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f50 extends AnimatorListenerAdapter {
    public final int f24072a;
    public final c60 f24073b;

    public f50(c60 c60Var, int i10) {
        this.f24072a = i10;
        this.f24073b = c60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24072a) {
            case 0:
                c60 c60Var = this.f24073b;
                if (animator.equals(c60Var.L)) {
                    c60Var.L = null;
                    return;
                }
                return;
            case 1:
                c60 c60Var2 = this.f24073b;
                if (c60Var2.f23196g1 != null) {
                    c60Var2.f23196g1 = null;
                    return;
                }
                return;
            default:
                c60 c60Var3 = this.f24073b;
                if (animator.equals(c60Var3.f23190e0)) {
                    c60Var3.c(true);
                    c60Var3.f23185b1 = false;
                    c60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
