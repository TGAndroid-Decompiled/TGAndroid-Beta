package org.telegram.ui;

import android.animation.ValueAnimator;
public final class on implements ValueAnimator.AnimatorUpdateListener {
    public final int f40192a;
    public final org.telegram.ui.Components.jb0 f40193b;

    public on(org.telegram.ui.Components.jb0 jb0Var, int i10) {
        this.f40192a = i10;
        this.f40193b = jb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40192a) {
            case 0:
                this.f40193b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40193b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f40193b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
