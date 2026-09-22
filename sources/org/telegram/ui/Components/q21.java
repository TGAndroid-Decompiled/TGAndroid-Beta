package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27233a;
    public final s21 f27234b;

    public q21(s21 s21Var, int i10) {
        this.f27233a = i10;
        this.f27234b = s21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27233a) {
            case 0:
                ai.n4 n4Var = this.f27234b.f27754f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                s21 s21Var = this.f27234b;
                s21Var.getClass();
                s21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21Var.h();
                return;
        }
    }
}
