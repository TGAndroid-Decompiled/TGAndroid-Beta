package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47064a;
    public final sr0 f47065b;

    public jr0(sr0 sr0Var, int i7) {
        this.f47064a = i7;
        this.f47065b = sr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47064a) {
            case 0:
                sr0 sr0Var = this.f47065b;
                sr0Var.getClass();
                sr0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sr0 sr0Var2 = this.f47065b;
                sr0Var2.getClass();
                sr0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
