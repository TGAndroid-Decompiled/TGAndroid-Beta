package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tj0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f30615a;
    public final fk0 f30616b;

    public tj0(fk0 fk0Var, float f7) {
        this.f30616b = fk0Var;
        this.f30615a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fk0 fk0Var = this.f30616b;
        fk0Var.f26107o0 = floatValue;
        fk0Var.f26106n0 = (1.0f - fk0Var.f26107o0) * this.f30615a;
        fk0Var.invalidate();
    }
}
