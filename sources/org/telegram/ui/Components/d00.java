package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23447a;
    public final k00 f23448b;

    public d00(k00 k00Var, int i10) {
        this.f23447a = i10;
        this.f23448b = k00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23447a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k00 k00Var = this.f23448b;
                k00Var.f25583x = floatValue;
                k00Var.invalidate();
                return;
            default:
                k00 k00Var2 = this.f23448b;
                k00Var2.getClass();
                k00Var2.f25584y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k00Var2.invalidate();
                return;
        }
    }
}
