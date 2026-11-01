package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ur0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31069a;
    public final ts0 f31070b;
    public final au0 f31071c;

    public ur0(au0 au0Var, ts0 ts0Var, int i10) {
        this.f31069a = i10;
        this.f31071c = au0Var;
        this.f31070b = ts0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31069a) {
            case 0:
                this.f31071c.f24545p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f31070b.h.invalidate();
                return;
            default:
                this.f31071c.f24545p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f31070b.h.invalidate();
                return;
        }
    }
}
