package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23463a;
    public final f31 f23464b;

    public d31(f31 f31Var, int i10) {
        this.f23463a = i10;
        this.f23464b = f31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23463a) {
            case 0:
                ai.n4 n4Var = this.f23464b.f24068f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                f31 f31Var = this.f23464b;
                f31Var.getClass();
                f31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.h();
                return;
        }
    }
}
