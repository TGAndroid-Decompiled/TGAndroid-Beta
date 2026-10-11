package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class al0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24535a;
    public final ml0 f24536b;

    public al0(ml0 ml0Var, float f7) {
        this.f24536b = ml0Var;
        this.f24535a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ml0 ml0Var = this.f24536b;
        ml0Var.f28779o0 = floatValue;
        ml0Var.f28778n0 = (1.0f - ml0Var.f28779o0) * this.f24535a;
        ml0Var.invalidate();
    }
}
