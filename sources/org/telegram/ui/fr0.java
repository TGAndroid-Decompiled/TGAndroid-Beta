package org.telegram.ui;

import android.animation.ValueAnimator;
public final class fr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45691a;
    public final or0 f45692b;

    public fr0(or0 or0Var, int i7) {
        this.f45691a = i7;
        this.f45692b = or0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45691a) {
            case 0:
                or0 or0Var = this.f45692b;
                or0Var.getClass();
                or0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                or0 or0Var2 = this.f45692b;
                or0Var2.getClass();
                or0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
