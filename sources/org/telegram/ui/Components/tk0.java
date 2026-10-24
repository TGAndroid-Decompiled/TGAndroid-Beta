package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f30855a;
    public final fl0 f30856b;

    public tk0(fl0 fl0Var, float f7) {
        this.f30856b = fl0Var;
        this.f30855a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fl0 fl0Var = this.f30856b;
        fl0Var.f26375o0 = floatValue;
        fl0Var.f26374n0 = (1.0f - fl0Var.f26375o0) * this.f30855a;
        fl0Var.invalidate();
    }
}
