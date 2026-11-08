package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38116a;
    public final sr0 f38117b;
    public final xs0 f38118c;

    public sq0(xs0 xs0Var, sr0 sr0Var, int i7) {
        this.f38116a = i7;
        this.f38118c = xs0Var;
        this.f38117b = sr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38116a) {
            case 0:
                this.f38118c.f40438p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38117b.h.invalidate();
                return;
            default:
                this.f38118c.f40438p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38117b.h.invalidate();
                return;
        }
    }
}
