package org.telegram.ui;

import android.animation.ValueAnimator;
public final class f61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33206a;
    public final i61 f33207b;

    public f61(i61 i61Var, int i10) {
        this.f33206a = i10;
        this.f33207b = i61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33206a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61 i61Var = this.f33207b;
                i61Var.N = floatValue;
                i61Var.V.f40021h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61 i61Var2 = this.f33207b;
                i61Var2.N = floatValue2;
                i61Var2.V.f40021h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61 i61Var3 = this.f33207b;
                i61Var3.N = floatValue3;
                i61Var3.V.f40021h0.invalidate();
                return;
        }
    }
}
