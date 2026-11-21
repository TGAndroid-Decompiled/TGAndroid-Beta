package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class er0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34970a;
    public final ds0 f34971b;
    public final jt0 f34972c;

    public er0(jt0 jt0Var, ds0 ds0Var, int i7) {
        this.f34970a = i7;
        this.f34972c = jt0Var;
        this.f34971b = ds0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34970a) {
            case 0:
                this.f34972c.f36665q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34971b.h.invalidate();
                return;
            default:
                this.f34972c.f36665q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34971b.h.invalidate();
                return;
        }
    }
}
