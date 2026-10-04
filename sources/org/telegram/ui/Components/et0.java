package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class et0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26127a;
    public final iu0 f26128b;
    public final pv0 f26129c;

    public et0(pv0 pv0Var, iu0 iu0Var, int i10) {
        this.f26127a = i10;
        this.f26129c = pv0Var;
        this.f26128b = iu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26127a) {
            case 0:
                this.f26129c.f29782n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26128b.h.invalidate();
                return;
            default:
                this.f26129c.f29782n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26128b.h.invalidate();
                return;
        }
    }
}
