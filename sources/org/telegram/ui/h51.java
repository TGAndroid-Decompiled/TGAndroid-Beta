package org.telegram.ui;

import android.animation.ValueAnimator;
public final class h51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37754a;
    public final k51 f37755b;

    public h51(k51 k51Var, int i10) {
        this.f37754a = i10;
        this.f37755b = k51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37754a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var = this.f37755b;
                k51Var.N = floatValue;
                k51Var.V.f35905h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var2 = this.f37755b;
                k51Var2.N = floatValue2;
                k51Var2.V.f35905h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var3 = this.f37755b;
                k51Var3.N = floatValue3;
                k51Var3.V.f35905h0.invalidate();
                return;
        }
    }
}
