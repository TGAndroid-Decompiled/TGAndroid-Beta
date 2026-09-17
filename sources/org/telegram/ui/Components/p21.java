package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29293a;
    public final r21 f29294b;

    public p21(r21 r21Var, int i10) {
        this.f29293a = i10;
        this.f29294b = r21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29293a) {
            case 0:
                bi.a4 a4Var = this.f29294b.f29929f;
                a4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a4Var.invalidate();
                return;
            default:
                r21 r21Var = this.f29294b;
                r21Var.getClass();
                r21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.h();
                return;
        }
    }
}
