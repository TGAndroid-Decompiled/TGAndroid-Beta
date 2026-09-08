package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28908a;
    public final qw0 f28909b;

    public nw0(qw0 qw0Var, int i10) {
        this.f28908a = i10;
        this.f28909b = qw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28908a) {
            case 0:
                qw0 qw0Var = this.f28909b;
                qw0Var.getClass();
                qw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var.invalidate();
                return;
            case 1:
                qw0 qw0Var2 = this.f28909b;
                qw0Var2.getClass();
                qw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                qw0 qw0Var3 = this.f28909b;
                qw0Var3.getClass();
                qw0Var3.f29858y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var3.invalidate();
                return;
        }
    }
}
