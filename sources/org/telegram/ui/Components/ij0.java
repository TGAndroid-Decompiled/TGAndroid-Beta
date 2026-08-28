package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ij0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f29447a;
    public final uj0 f29448b;

    public ij0(uj0 uj0Var, float f10) {
        this.f29448b = uj0Var;
        this.f29447a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uj0 uj0Var = this.f29448b;
        uj0Var.f33063k0 = floatValue;
        uj0Var.f33062j0 = (1.0f - uj0Var.f33063k0) * this.f29447a;
        uj0Var.invalidate();
    }
}
