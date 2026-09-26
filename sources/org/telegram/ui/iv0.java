package org.telegram.ui;

import android.animation.ValueAnimator;
public final class iv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34586a;
    public final rv0 f34587b;

    public iv0(rv0 rv0Var, int i10) {
        this.f34586a = i10;
        this.f34587b = rv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34586a) {
            case 0:
                rv0 rv0Var = this.f34587b;
                rv0Var.getClass();
                rv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rv0 rv0Var2 = this.f34587b;
                rv0Var2.getClass();
                rv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
