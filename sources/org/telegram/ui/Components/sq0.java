package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38100a;
    public final sr0 f38101b;
    public final xs0 f38102c;

    public sq0(xs0 xs0Var, sr0 sr0Var, int i7) {
        this.f38100a = i7;
        this.f38102c = xs0Var;
        this.f38101b = sr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38100a) {
            case 0:
                this.f38102c.f40417p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38101b.h.invalidate();
                return;
            default:
                this.f38102c.f40417p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38101b.h.invalidate();
                return;
        }
    }
}
