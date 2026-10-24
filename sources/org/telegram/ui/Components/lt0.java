package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28433a;
    public final pu0 f28434b;
    public final wv0 f28435c;

    public lt0(wv0 wv0Var, pu0 pu0Var, int i10) {
        this.f28433a = i10;
        this.f28435c = wv0Var;
        this.f28434b = pu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28433a) {
            case 0:
                this.f28435c.f32392n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28434b.h.invalidate();
                return;
            default:
                this.f28435c.f32392n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28434b.h.invalidate();
                return;
        }
    }
}
