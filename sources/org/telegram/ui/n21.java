package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39679a;
    public final q21 f39680b;

    public n21(q21 q21Var, int i10) {
        this.f39679a = i10;
        this.f39680b = q21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39679a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21 q21Var = this.f39680b;
                q21Var.N = floatValue;
                q21Var.V.f37305h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21 q21Var2 = this.f39680b;
                q21Var2.N = floatValue2;
                q21Var2.V.f37305h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21 q21Var3 = this.f39680b;
                q21Var3.N = floatValue3;
                q21Var3.V.f37305h0.invalidate();
                return;
        }
    }
}
