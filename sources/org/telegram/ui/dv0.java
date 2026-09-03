package org.telegram.ui;

import android.animation.ValueAnimator;
public final class dv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33537a;
    public final mv0 f33538b;

    public dv0(mv0 mv0Var, int i10) {
        this.f33537a = i10;
        this.f33538b = mv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33537a) {
            case 0:
                mv0 mv0Var = this.f33538b;
                mv0Var.getClass();
                mv0Var.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mv0 mv0Var2 = this.f33538b;
                mv0Var2.getClass();
                mv0Var2.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
