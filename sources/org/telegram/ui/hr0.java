package org.telegram.ui;

import android.animation.ValueAnimator;
public final class hr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48488a;
    public final qr0 f48489b;

    public hr0(qr0 qr0Var, int i7) {
        this.f48488a = i7;
        this.f48489b = qr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48488a) {
            case 0:
                qr0 qr0Var = this.f48489b;
                qr0Var.getClass();
                qr0Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                qr0 qr0Var2 = this.f48489b;
                qr0Var2.getClass();
                qr0Var2.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
