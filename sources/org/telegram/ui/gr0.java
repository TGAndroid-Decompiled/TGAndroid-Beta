package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46087a;
    public final pr0 f46088b;

    public gr0(pr0 pr0Var, int i7) {
        this.f46087a = i7;
        this.f46088b = pr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46087a) {
            case 0:
                pr0 pr0Var = this.f46088b;
                pr0Var.getClass();
                pr0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                pr0 pr0Var2 = this.f46088b;
                pr0Var2.getClass();
                pr0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
