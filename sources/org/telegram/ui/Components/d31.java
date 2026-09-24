package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23455a;
    public final f31 f23456b;

    public d31(f31 f31Var, int i10) {
        this.f23455a = i10;
        this.f23456b = f31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23455a) {
            case 0:
                ai.n4 n4Var = this.f23456b.f24062f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                f31 f31Var = this.f23456b;
                f31Var.getClass();
                f31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.h();
                return;
        }
    }
}
