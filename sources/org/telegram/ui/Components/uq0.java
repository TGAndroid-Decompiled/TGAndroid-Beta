package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38777a;
    public final ur0 f38778b;
    public final zs0 f38779c;

    public uq0(zs0 zs0Var, ur0 ur0Var, int i7) {
        this.f38777a = i7;
        this.f38779c = zs0Var;
        this.f38778b = ur0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38777a) {
            case 0:
                this.f38779c.f41104p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38778b.h.invalidate();
                return;
            default:
                this.f38779c.f41104p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f38778b.h.invalidate();
                return;
        }
    }
}
