package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e50 extends AnimatorListenerAdapter {
    public final int f23861a;
    public final c60 f23862b;

    public e50(c60 c60Var, int i10) {
        this.f23861a = i10;
        this.f23862b = c60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23861a) {
            case 0:
                c60 c60Var = this.f23862b;
                if (animator.equals(c60Var.L)) {
                    c60Var.L = null;
                    return;
                }
                return;
            case 1:
                c60 c60Var2 = this.f23862b;
                if (c60Var2.f23236g1 != null) {
                    c60Var2.f23236g1 = null;
                    return;
                }
                return;
            default:
                c60 c60Var3 = this.f23862b;
                if (animator.equals(c60Var3.f23230e0)) {
                    c60Var3.c(true);
                    c60Var3.f23225b1 = false;
                    c60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
