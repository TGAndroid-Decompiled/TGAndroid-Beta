package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f33097a;
    public final fl0 f33098b;

    public tk0(fl0 fl0Var, float f7) {
        this.f33098b = fl0Var;
        this.f33097a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fl0 fl0Var = this.f33098b;
        fl0Var.f28257o0 = floatValue;
        fl0Var.f28256n0 = (1.0f - fl0Var.f28257o0) * this.f33097a;
        fl0Var.invalidate();
    }
}
