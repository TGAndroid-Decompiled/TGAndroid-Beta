package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ax0 extends AnimatorListenerAdapter {
    public final int f22817a;
    public final bx0 f22818b;

    public ax0(bx0 bx0Var, int i10) {
        this.f22817a = i10;
        this.f22818b = bx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22817a) {
            case 0:
                bx0 bx0Var = this.f22818b;
                bx0Var.f23121y = 1.0f;
                bx0Var.invalidate();
                bx0Var.G = null;
                return;
            case 1:
                bx0 bx0Var2 = this.f22818b;
                bx0Var2.m(((Float) bx0Var2.v.getAnimatedValue()).floatValue());
                bx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f22818b.F = null;
                return;
        }
    }
}
