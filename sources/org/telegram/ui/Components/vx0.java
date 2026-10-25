package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vx0 extends AnimatorListenerAdapter {
    public final int f34294a;
    public final wx0 f34295b;

    public vx0(wx0 wx0Var, int i10) {
        this.f34294a = i10;
        this.f34295b = wx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34294a) {
            case 0:
                wx0 wx0Var = this.f34295b;
                wx0Var.f34547y = 1.0f;
                wx0Var.invalidate();
                wx0Var.G = null;
                return;
            case 1:
                wx0 wx0Var2 = this.f34295b;
                wx0Var2.m(((Float) wx0Var2.v.getAnimatedValue()).floatValue());
                wx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f34295b.F = null;
                return;
        }
    }
}
