package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ys0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30603a;
    public final cu0 f30604b;
    public final jv0 f30605c;

    public ys0(jv0 jv0Var, cu0 cu0Var, int i10) {
        this.f30603a = i10;
        this.f30605c = jv0Var;
        this.f30604b = cu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30603a) {
            case 0:
                this.f30605c.f25510n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30604b.h.invalidate();
                return;
            default:
                this.f30605c.f25510n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30604b.h.invalidate();
                return;
        }
    }
}
