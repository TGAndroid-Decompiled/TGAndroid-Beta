package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30263a;
    public final s21 f30264b;

    public q21(s21 s21Var, int i10) {
        this.f30263a = i10;
        this.f30264b = s21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30263a) {
            case 0:
                oh.b3 b3Var = this.f30264b.f30962f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                s21 s21Var = this.f30264b;
                s21Var.getClass();
                s21Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21Var.h();
                return;
        }
    }
}
