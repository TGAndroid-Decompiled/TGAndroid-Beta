package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29089a;
    public final r31 f29090b;

    public o31(r31 r31Var, int i10) {
        this.f29089a = i10;
        this.f29090b = r31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29089a) {
            case 0:
                ci.h3 h3Var = this.f29090b.f30065f;
                h3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.invalidate();
                return;
            default:
                r31 r31Var = this.f29090b;
                r31Var.getClass();
                r31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.h();
                return;
        }
    }
}
