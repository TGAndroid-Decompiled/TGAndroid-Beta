package org.telegram.ui;

import android.animation.ValueAnimator;
public final class g61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33831a;
    public final j61 f33832b;

    public g61(j61 j61Var, int i10) {
        this.f33831a = i10;
        this.f33832b = j61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33831a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var = this.f33832b;
                j61Var.N = floatValue;
                j61Var.V.f32026h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var2 = this.f33832b;
                j61Var2.N = floatValue2;
                j61Var2.V.f32026h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var3 = this.f33832b;
                j61Var3.N = floatValue3;
                j61Var3.V.f32026h0.invalidate();
                return;
        }
    }
}
