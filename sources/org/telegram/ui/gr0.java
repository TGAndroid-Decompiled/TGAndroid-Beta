package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48162a;
    public final pr0 f48163b;

    public gr0(pr0 pr0Var, int i7) {
        this.f48162a = i7;
        this.f48163b = pr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48162a) {
            case 0:
                pr0 pr0Var = this.f48163b;
                pr0Var.getClass();
                pr0Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                pr0 pr0Var2 = this.f48163b;
                pr0Var2.getClass();
                pr0Var2.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
