package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xh0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f40388a;
    public final ji0 f40389b;

    public xh0(ji0 ji0Var, float f10) {
        this.f40389b = ji0Var;
        this.f40388a = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ji0 ji0Var = this.f40389b;
        ji0Var.f35055o0 = floatValue;
        ji0Var.f35054n0 = (1.0f - ji0Var.f35055o0) * this.f40388a;
        ji0Var.invalidate();
    }
}
