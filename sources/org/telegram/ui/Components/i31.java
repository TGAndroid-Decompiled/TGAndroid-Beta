package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27064a;
    public final k31 f27065b;

    public i31(k31 k31Var, int i10) {
        this.f27064a = i10;
        this.f27065b = k31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27064a) {
            case 0:
                ci.i3 i3Var = this.f27065b.f27723f;
                i3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.invalidate();
                return;
            default:
                k31 k31Var = this.f27065b;
                k31Var.getClass();
                k31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.h();
                return;
        }
    }
}
