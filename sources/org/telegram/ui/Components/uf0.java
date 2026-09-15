package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf0 extends AnimatorListenerAdapter {
    public final int f28392a;
    public final vf0 f28393b;

    public uf0(vf0 vf0Var, int i10) {
        this.f28392a = i10;
        this.f28393b = vf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28392a) {
            case 0:
                vf0 vf0Var = this.f28393b;
                vf0Var.h = false;
                vf0Var.f28698a = vf0Var.f28700c;
                vf0Var.invalidate();
                int i10 = vf0Var.J;
                if (i10 >= 0) {
                    vf0Var.b(i10);
                    vf0Var.J = -1;
                    return;
                }
                return;
            default:
                vf0 vf0Var2 = this.f28393b;
                vf0Var2.f28702n = false;
                vf0Var2.h = false;
                vf0Var2.invalidate();
                int i11 = vf0Var2.J;
                if (i11 >= 0) {
                    vf0Var2.b(i11);
                    vf0Var2.J = -1;
                }
                vf0Var2.a();
                return;
        }
    }
}
