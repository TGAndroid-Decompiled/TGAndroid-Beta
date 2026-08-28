package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ou0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41246a;
    public final xu0 f41247b;

    public ou0(xu0 xu0Var, int i9) {
        this.f41246a = i9;
        this.f41247b = xu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41246a) {
            case 0:
                xu0 xu0Var = this.f41247b;
                xu0Var.getClass();
                xu0Var.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                xu0 xu0Var2 = this.f41247b;
                xu0Var2.getClass();
                xu0Var2.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
