package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class li0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f37195a;
    public final xi0 f37196b;

    public li0(xi0 xi0Var, float f10) {
        this.f37196b = xi0Var;
        this.f37195a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        xi0 xi0Var = this.f37196b;
        xi0Var.f42132p0 = floatValue;
        xi0Var.f42131o0 = (1.0f - xi0Var.f42132p0) * this.f37195a;
        xi0Var.invalidate();
    }
}
