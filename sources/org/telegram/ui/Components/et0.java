package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class et0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26133a;
    public final iu0 f26134b;
    public final pv0 f26135c;

    public et0(pv0 pv0Var, iu0 iu0Var, int i10) {
        this.f26133a = i10;
        this.f26135c = pv0Var;
        this.f26134b = iu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26133a) {
            case 0:
                this.f26135c.f29788n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26134b.h.invalidate();
                return;
            default:
                this.f26135c.f29788n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26134b.h.invalidate();
                return;
        }
    }
}
