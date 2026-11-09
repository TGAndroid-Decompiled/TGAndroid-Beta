package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ir0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46748a;
    public final rr0 f46749b;

    public ir0(rr0 rr0Var, int i7) {
        this.f46748a = i7;
        this.f46749b = rr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46748a) {
            case 0:
                rr0 rr0Var = this.f46749b;
                rr0Var.getClass();
                rr0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rr0 rr0Var2 = this.f46749b;
                rr0Var2.getClass();
                rr0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
