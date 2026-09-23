package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34518a;
    public final tv0 f34519b;

    public jv0(tv0 tv0Var, int i10) {
        this.f34518a = i10;
        this.f34519b = tv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34518a) {
            case 0:
                tv0 tv0Var = this.f34519b;
                tv0Var.getClass();
                tv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tv0 tv0Var2 = this.f34519b;
                tv0Var2.getClass();
                tv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
