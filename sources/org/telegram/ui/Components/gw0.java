package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29005a;
    public final jw0 f29006b;

    public gw0(jw0 jw0Var, int i10) {
        this.f29005a = i10;
        this.f29006b = jw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29005a) {
            case 0:
                jw0 jw0Var = this.f29006b;
                jw0Var.getClass();
                jw0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.invalidate();
                return;
            case 1:
                jw0 jw0Var2 = this.f29006b;
                jw0Var2.getClass();
                jw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                jw0 jw0Var3 = this.f29006b;
                jw0Var3.getClass();
                jw0Var3.f29839y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var3.invalidate();
                return;
        }
    }
}
