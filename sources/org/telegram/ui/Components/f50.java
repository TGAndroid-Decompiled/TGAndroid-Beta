package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f50 extends AnimatorListenerAdapter {
    public final int f24078a;
    public final c60 f24079b;

    public f50(c60 c60Var, int i10) {
        this.f24078a = i10;
        this.f24079b = c60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24078a) {
            case 0:
                c60 c60Var = this.f24079b;
                if (animator.equals(c60Var.L)) {
                    c60Var.L = null;
                    return;
                }
                return;
            case 1:
                c60 c60Var2 = this.f24079b;
                if (c60Var2.f23225g1 != null) {
                    c60Var2.f23225g1 = null;
                    return;
                }
                return;
            default:
                c60 c60Var3 = this.f24079b;
                if (animator.equals(c60Var3.f23219e0)) {
                    c60Var3.c(true);
                    c60Var3.f23214b1 = false;
                    c60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
