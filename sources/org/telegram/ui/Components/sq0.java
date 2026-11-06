package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38096a;
    public final sr0 f38097b;
    public final xs0 f38098c;

    public sq0(xs0 xs0Var, sr0 sr0Var, int i7) {
        this.f38096a = i7;
        this.f38098c = xs0Var;
        this.f38097b = sr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38096a) {
            case 0:
                this.f38098c.f40401p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38097b.h.invalidate();
                return;
            default:
                this.f38098c.f40401p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38097b.h.invalidate();
                return;
        }
    }
}
