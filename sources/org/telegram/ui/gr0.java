package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46086a;
    public final pr0 f46087b;

    public gr0(pr0 pr0Var, int i7) {
        this.f46086a = i7;
        this.f46087b = pr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46086a) {
            case 0:
                pr0 pr0Var = this.f46087b;
                pr0Var.getClass();
                pr0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                pr0 pr0Var2 = this.f46087b;
                pr0Var2.getClass();
                pr0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
