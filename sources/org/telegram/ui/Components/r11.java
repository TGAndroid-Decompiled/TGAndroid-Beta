package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39152a;
    public final u11 f39153b;

    public r11(u11 u11Var, int i7) {
        this.f39152a = i7;
        this.f39153b = u11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39152a) {
            case 0:
                fi.u2 u2Var = this.f39153b.f40227f;
                u2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.invalidate();
                return;
            default:
                u11 u11Var = this.f39153b;
                u11Var.getClass();
                u11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var.h();
                return;
        }
    }
}
