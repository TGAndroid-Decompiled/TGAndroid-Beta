package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vx0 extends AnimatorListenerAdapter {
    public final int f34297a;
    public final wx0 f34298b;

    public vx0(wx0 wx0Var, int i10) {
        this.f34297a = i10;
        this.f34298b = wx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34297a) {
            case 0:
                wx0 wx0Var = this.f34298b;
                wx0Var.f34550y = 1.0f;
                wx0Var.invalidate();
                wx0Var.G = null;
                return;
            case 1:
                wx0 wx0Var2 = this.f34298b;
                wx0Var2.m(((Float) wx0Var2.v.getAnimatedValue()).floatValue());
                wx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f34298b.F = null;
                return;
        }
    }
}
