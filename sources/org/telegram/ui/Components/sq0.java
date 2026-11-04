package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38108a;
    public final rr0 f38109b;
    public final ws0 f38110c;

    public sq0(ws0 ws0Var, rr0 rr0Var, int i3) {
        this.f38108a = i3;
        this.f38110c = ws0Var;
        this.f38109b = rr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38108a) {
            case 0:
                this.f38110c.f40118q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38109b.h.invalidate();
                return;
            default:
                this.f38110c.f40118q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38109b.h.invalidate();
                return;
        }
    }
}
