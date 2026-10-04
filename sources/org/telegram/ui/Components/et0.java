package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class et0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26128a;
    public final iu0 f26129b;
    public final pv0 f26130c;

    public et0(pv0 pv0Var, iu0 iu0Var, int i10) {
        this.f26128a = i10;
        this.f26130c = pv0Var;
        this.f26129b = iu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26128a) {
            case 0:
                this.f26130c.f29783n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26129b.h.invalidate();
                return;
            default:
                this.f26130c.f29783n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26129b.h.invalidate();
                return;
        }
    }
}
