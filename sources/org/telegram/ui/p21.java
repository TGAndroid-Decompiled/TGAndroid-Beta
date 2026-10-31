package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40433a;
    public final s21 f40434b;

    public p21(s21 s21Var, int i10) {
        this.f40433a = i10;
        this.f40434b = s21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40433a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21 s21Var = this.f40434b;
                s21Var.N = floatValue;
                s21Var.V.f38129h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21 s21Var2 = this.f40434b;
                s21Var2.N = floatValue2;
                s21Var2.V.f38129h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21 s21Var3 = this.f40434b;
                s21Var3.N = floatValue3;
                s21Var3.V.f38129h0.invalidate();
                return;
        }
    }
}
