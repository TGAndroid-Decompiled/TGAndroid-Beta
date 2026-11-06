package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40798a;
    public final b11 f40799b;

    public z01(b11 b11Var, int i7) {
        this.f40798a = i7;
        this.f40799b = b11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40798a) {
            case 0:
                di.b3 b3Var = this.f40799b.f31971f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                b11 b11Var = this.f40799b;
                b11Var.getClass();
                b11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var.h();
                return;
        }
    }
}
