package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class li0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f37196a;
    public final xi0 f37197b;

    public li0(xi0 xi0Var, float f10) {
        this.f37197b = xi0Var;
        this.f37196a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        xi0 xi0Var = this.f37197b;
        xi0Var.f42133p0 = floatValue;
        xi0Var.f42132o0 = (1.0f - xi0Var.f42133p0) * this.f37196a;
        xi0Var.invalidate();
    }
}
