package org.telegram.ui;

import android.animation.ValueAnimator;
public final class h51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38686a;
    public final k51 f38687b;

    public h51(k51 k51Var, int i9) {
        this.f38686a = i9;
        this.f38687b = k51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38686a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var = this.f38687b;
                k51Var.J = floatValue;
                k51Var.R.f36669d0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var2 = this.f38687b;
                k51Var2.J = floatValue2;
                k51Var2.R.f36669d0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var3 = this.f38687b;
                k51Var3.J = floatValue3;
                k51Var3.R.f36669d0.invalidate();
                return;
        }
    }
}
