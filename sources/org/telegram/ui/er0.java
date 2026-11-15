package org.telegram.ui;

import android.animation.ValueAnimator;
public final class er0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46889a;
    public final nr0 f46890b;

    public er0(nr0 nr0Var, int i7) {
        this.f46889a = i7;
        this.f46890b = nr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46889a) {
            case 0:
                nr0 nr0Var = this.f46890b;
                nr0Var.getClass();
                nr0Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                nr0 nr0Var2 = this.f46890b;
                nr0Var2.getClass();
                nr0Var2.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
