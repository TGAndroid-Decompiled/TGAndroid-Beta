package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27635a;
    public final nu0 f27636b;
    public final uv0 f27637c;

    public jt0(uv0 uv0Var, nu0 nu0Var, int i10) {
        this.f27635a = i10;
        this.f27637c = uv0Var;
        this.f27636b = nu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27635a) {
            case 0:
                this.f27637c.f31052n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27636b.h.invalidate();
                return;
            default:
                this.f27637c.f31052n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27636b.h.invalidate();
                return;
        }
    }
}
