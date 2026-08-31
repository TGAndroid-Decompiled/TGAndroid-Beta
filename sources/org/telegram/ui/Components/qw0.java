package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30516a;
    public final tw0 f30517b;

    public qw0(tw0 tw0Var, int i10) {
        this.f30516a = i10;
        this.f30517b = tw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30516a) {
            case 0:
                tw0 tw0Var = this.f30517b;
                tw0Var.getClass();
                tw0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw0Var.invalidate();
                return;
            case 1:
                tw0 tw0Var2 = this.f30517b;
                tw0Var2.getClass();
                tw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tw0 tw0Var3 = this.f30517b;
                tw0Var3.getClass();
                tw0Var3.f31469y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw0Var3.invalidate();
                return;
        }
    }
}
