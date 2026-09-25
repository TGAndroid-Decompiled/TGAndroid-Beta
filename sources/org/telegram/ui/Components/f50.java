package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f50 extends AnimatorListenerAdapter {
    public final int f24079a;
    public final c60 f24080b;

    public f50(c60 c60Var, int i10) {
        this.f24079a = i10;
        this.f24080b = c60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24079a) {
            case 0:
                c60 c60Var = this.f24080b;
                if (animator.equals(c60Var.L)) {
                    c60Var.L = null;
                    return;
                }
                return;
            case 1:
                c60 c60Var2 = this.f24080b;
                if (c60Var2.f23226g1 != null) {
                    c60Var2.f23226g1 = null;
                    return;
                }
                return;
            default:
                c60 c60Var3 = this.f24080b;
                if (animator.equals(c60Var3.f23220e0)) {
                    c60Var3.c(true);
                    c60Var3.f23215b1 = false;
                    c60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
