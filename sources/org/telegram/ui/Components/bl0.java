package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bl0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24680a;
    public final nl0 f24681b;

    public bl0(nl0 nl0Var, float f7) {
        this.f24681b = nl0Var;
        this.f24680a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        nl0 nl0Var = this.f24681b;
        nl0Var.f28849o0 = floatValue;
        nl0Var.f28848n0 = (1.0f - nl0Var.f28849o0) * this.f24680a;
        nl0Var.invalidate();
    }
}
