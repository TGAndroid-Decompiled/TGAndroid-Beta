package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class og0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29045a;
    public final qg0 f29046b;

    public og0(qg0 qg0Var, int i10) {
        this.f29045a = i10;
        this.f29046b = qg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29045a) {
            case 0:
                qg0 qg0Var = this.f29046b;
                qg0Var.getClass();
                qg0Var.f29585y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var.invalidate();
                return;
            default:
                qg0 qg0Var2 = this.f29046b;
                qg0Var2.getClass();
                qg0Var2.f29585y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var2.invalidate();
                return;
        }
    }
}
