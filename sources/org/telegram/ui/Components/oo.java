package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class oo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f31416a = false;
    public final cp f31417b;

    public oo(cp cpVar) {
        this.f31417b = cpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cp cpVar = this.f31417b;
        cpVar.O = floatValue;
        cpVar.N.invalidate();
        if (!this.f31416a && cpVar.O > 0.5f) {
            this.f31416a = true;
        }
    }
}
