package org.telegram.ui;

import android.animation.ValueAnimator;

public final class pu0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f41432a;

    public final yu0 f41433b;

    public pu0(yu0 yu0Var, int i10) {
        this.f41432a = i10;
        this.f41433b = yu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41432a) {
            case 0:
                yu0 yu0Var = this.f41433b;
                yu0Var.getClass();
                yu0Var.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                yu0 yu0Var2 = this.f41433b;
                yu0Var2.getClass();
                yu0Var2.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
