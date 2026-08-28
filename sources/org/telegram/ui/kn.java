package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kn implements ValueAnimator.AnimatorUpdateListener {
    public final int f39874a;
    public final org.telegram.ui.Components.jb0 f39875b;

    public kn(org.telegram.ui.Components.jb0 jb0Var, int i9) {
        this.f39874a = i9;
        this.f39875b = jb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39874a) {
            case 0:
                this.f39875b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39875b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f39875b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
