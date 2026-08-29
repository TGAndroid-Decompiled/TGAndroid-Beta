package org.telegram.ui;

import android.animation.ValueAnimator;
public final class mu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40636a;
    public final vu0 f40637b;

    public mu0(vu0 vu0Var, int i10) {
        this.f40636a = i10;
        this.f40637b = vu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40636a) {
            case 0:
                vu0 vu0Var = this.f40637b;
                vu0Var.getClass();
                vu0Var.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vu0 vu0Var2 = this.f40637b;
                vu0Var2.getClass();
                vu0Var2.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
