package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38136a;
    public final sr0 f38137b;
    public final xs0 f38138c;

    public sq0(xs0 xs0Var, sr0 sr0Var, int i7) {
        this.f38136a = i7;
        this.f38138c = xs0Var;
        this.f38137b = sr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38136a) {
            case 0:
                this.f38138c.f40382p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38137b.h.invalidate();
                return;
            default:
                this.f38138c.f40382p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38137b.h.invalidate();
                return;
        }
    }
}
