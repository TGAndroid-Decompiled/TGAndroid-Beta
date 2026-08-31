package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f26938a;
    public final rk0 f26939b;

    public fk0(rk0 rk0Var, float f10) {
        this.f26939b = rk0Var;
        this.f26938a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rk0 rk0Var = this.f26939b;
        rk0Var.f30775l0 = floatValue;
        rk0Var.f30774k0 = (1.0f - rk0Var.f30775l0) * this.f26938a;
        rk0Var.invalidate();
    }
}
