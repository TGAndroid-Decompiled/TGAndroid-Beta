package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27071a;
    public final k31 f27072b;

    public i31(k31 k31Var, int i10) {
        this.f27071a = i10;
        this.f27072b = k31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27071a) {
            case 0:
                ci.i3 i3Var = this.f27072b.f27730f;
                i3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.invalidate();
                return;
            default:
                k31 k31Var = this.f27072b;
                k31Var.getClass();
                k31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.h();
                return;
        }
    }
}
