package org.telegram.ui;

import android.animation.ValueAnimator;
public final class iv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34674a;
    public final rv0 f34675b;

    public iv0(rv0 rv0Var, int i10) {
        this.f34674a = i10;
        this.f34675b = rv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34674a) {
            case 0:
                rv0 rv0Var = this.f34675b;
                rv0Var.getClass();
                rv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rv0 rv0Var2 = this.f34675b;
                rv0Var2.getClass();
                rv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
