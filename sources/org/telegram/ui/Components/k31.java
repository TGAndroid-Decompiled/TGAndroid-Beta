package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27736a;
    public final m31 f27737b;

    public k31(m31 m31Var, int i10) {
        this.f27736a = i10;
        this.f27737b = m31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27736a) {
            case 0:
                ci.i3 i3Var = this.f27737b.f28375f;
                i3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.invalidate();
                return;
            default:
                m31 m31Var = this.f27737b;
                m31Var.getClass();
                m31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m31Var.h();
                return;
        }
    }
}
