package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24288a;
    public final rk0 f24289b;

    public fk0(rk0 rk0Var, float f7) {
        this.f24289b = rk0Var;
        this.f24288a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rk0 rk0Var = this.f24289b;
        rk0Var.f27976o0 = floatValue;
        rk0Var.f27975n0 = (1.0f - rk0Var.f27976o0) * this.f24288a;
        rk0Var.invalidate();
    }
}
