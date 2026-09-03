package org.telegram.ui;

import android.animation.ValueAnimator;
public final class dv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36270a;
    public final mv0 f36271b;

    public dv0(mv0 mv0Var, int i10) {
        this.f36270a = i10;
        this.f36271b = mv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36270a) {
            case 0:
                mv0 mv0Var = this.f36271b;
                mv0Var.getClass();
                mv0Var.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mv0 mv0Var2 = this.f36271b;
                mv0Var2.getClass();
                mv0Var2.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
