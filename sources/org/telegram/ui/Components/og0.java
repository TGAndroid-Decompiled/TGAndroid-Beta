package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class og0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29049a;
    public final qg0 f29050b;

    public og0(qg0 qg0Var, int i10) {
        this.f29049a = i10;
        this.f29050b = qg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29049a) {
            case 0:
                qg0 qg0Var = this.f29050b;
                qg0Var.getClass();
                qg0Var.f29589y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var.invalidate();
                return;
            default:
                qg0 qg0Var2 = this.f29050b;
                qg0Var2.getClass();
                qg0Var2.f29589y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var2.invalidate();
                return;
        }
    }
}
