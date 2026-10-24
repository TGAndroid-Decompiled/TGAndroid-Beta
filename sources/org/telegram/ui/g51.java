package org.telegram.ui;

import android.animation.ValueAnimator;
public final class g51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37457a;
    public final j51 f37458b;

    public g51(j51 j51Var, int i10) {
        this.f37457a = i10;
        this.f37458b = j51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37457a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var = this.f37458b;
                j51Var.N = floatValue;
                j51Var.V.f35622h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var2 = this.f37458b;
                j51Var2.N = floatValue2;
                j51Var2.V.f35622h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var3 = this.f37458b;
                j51Var3.N = floatValue3;
                j51Var3.V.f35622h0.invalidate();
                return;
        }
    }
}
