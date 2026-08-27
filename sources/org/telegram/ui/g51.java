package org.telegram.ui;

import android.animation.ValueAnimator;

public final class g51 implements ValueAnimator.AnimatorUpdateListener {

    public final int f38323a;

    public final j51 f38324b;

    public g51(j51 j51Var, int i10) {
        this.f38323a = i10;
        this.f38324b = j51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38323a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var = this.f38324b;
                j51Var.J = fFloatValue;
                j51Var.R.f36392d0.invalidate();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var2 = this.f38324b;
                j51Var2.J = fFloatValue2;
                j51Var2.R.f36392d0.invalidate();
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var3 = this.f38324b;
                j51Var3.J = fFloatValue3;
                j51Var3.R.f36392d0.invalidate();
                break;
        }
    }
}
