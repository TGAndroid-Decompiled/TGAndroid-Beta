package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24880a;
    public final tk0 f24881b;

    public hk0(tk0 tk0Var, float f7) {
        this.f24881b = tk0Var;
        this.f24880a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        tk0 tk0Var = this.f24881b;
        tk0Var.f28580o0 = floatValue;
        tk0Var.f28579n0 = (1.0f - tk0Var.f28580o0) * this.f24880a;
        tk0Var.invalidate();
    }
}
