package org.telegram.ui;

import android.animation.ValueAnimator;
public final class dv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38940a;
    public final mv0 f38941b;

    public dv0(mv0 mv0Var, int i10) {
        this.f38940a = i10;
        this.f38941b = mv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38940a) {
            case 0:
                mv0 mv0Var = this.f38941b;
                mv0Var.getClass();
                mv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mv0 mv0Var2 = this.f38941b;
                mv0Var2.getClass();
                mv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
