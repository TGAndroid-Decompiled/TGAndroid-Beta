package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tj0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f32965a;
    public final fk0 f32966b;

    public tj0(fk0 fk0Var, float f9) {
        this.f32966b = fk0Var;
        this.f32965a = f9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fk0 fk0Var = this.f32966b;
        fk0Var.f28452k0 = floatValue;
        fk0Var.f28451j0 = (1.0f - fk0Var.f28452k0) * this.f32965a;
        fk0Var.invalidate();
    }
}
