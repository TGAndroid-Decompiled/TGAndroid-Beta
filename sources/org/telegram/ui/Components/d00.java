package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23471a;
    public final k00 f23472b;

    public d00(k00 k00Var, int i10) {
        this.f23471a = i10;
        this.f23472b = k00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23471a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k00 k00Var = this.f23472b;
                k00Var.f25584x = floatValue;
                k00Var.invalidate();
                return;
            default:
                k00 k00Var2 = this.f23472b;
                k00Var2.getClass();
                k00Var2.f25585y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k00Var2.invalidate();
                return;
        }
    }
}
