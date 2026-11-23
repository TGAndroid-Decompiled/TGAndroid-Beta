package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class li0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f37151a;
    public final xi0 f37152b;

    public li0(xi0 xi0Var, float f10) {
        this.f37152b = xi0Var;
        this.f37151a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        xi0 xi0Var = this.f37152b;
        xi0Var.f42087p0 = floatValue;
        xi0Var.f42086o0 = (1.0f - xi0Var.f42087p0) * this.f37151a;
        xi0Var.invalidate();
    }
}
