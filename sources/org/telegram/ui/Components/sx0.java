package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30893a;
    public final vx0 f30894b;

    public sx0(vx0 vx0Var, int i10) {
        this.f30893a = i10;
        this.f30894b = vx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30893a) {
            case 0:
                vx0 vx0Var = this.f30894b;
                vx0Var.getClass();
                vx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vx0Var.invalidate();
                return;
            case 1:
                vx0 vx0Var2 = this.f30894b;
                vx0Var2.getClass();
                vx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vx0 vx0Var3 = this.f30894b;
                vx0Var3.getClass();
                vx0Var3.f32509y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vx0Var3.invalidate();
                return;
        }
    }
}
