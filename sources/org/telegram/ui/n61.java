package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35899a;
    public final q61 f35900b;

    public n61(q61 q61Var, int i10) {
        this.f35899a = i10;
        this.f35900b = q61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35899a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61 q61Var = this.f35900b;
                q61Var.N = floatValue;
                q61Var.V.f34132h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61 q61Var2 = this.f35900b;
                q61Var2.N = floatValue2;
                q61Var2.V.f34132h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61 q61Var3 = this.f35900b;
                q61Var3.N = floatValue3;
                q61Var3.V.f34132h0.invalidate();
                return;
        }
    }
}
