package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47848a;
    public final q01 f47849b;

    public n01(q01 q01Var, int i3) {
        this.f47848a = i3;
        this.f47849b = q01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47848a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q01 q01Var = this.f47849b;
                q01Var.O = floatValue;
                q01Var.W.f45456i0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q01 q01Var2 = this.f47849b;
                q01Var2.O = floatValue2;
                q01Var2.W.f45456i0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q01 q01Var3 = this.f47849b;
                q01Var3.O = floatValue3;
                q01Var3.W.f45456i0.invalidate();
                return;
        }
    }
}
