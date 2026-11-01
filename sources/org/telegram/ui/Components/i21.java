package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26990a;
    public final k21 f26991b;

    public i21(k21 k21Var, int i10) {
        this.f26990a = i10;
        this.f26991b = k21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26990a) {
            case 0:
                ih.c cVar = this.f26991b.f27714f;
                cVar.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                cVar.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                cVar.invalidate();
                return;
            default:
                k21 k21Var = this.f26991b;
                k21Var.getClass();
                k21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k21Var.h();
                return;
        }
    }
}
