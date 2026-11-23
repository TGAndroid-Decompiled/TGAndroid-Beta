package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class er0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34968a;
    public final ds0 f34969b;
    public final jt0 f34970c;

    public er0(jt0 jt0Var, ds0 ds0Var, int i7) {
        this.f34968a = i7;
        this.f34970c = jt0Var;
        this.f34969b = ds0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34968a) {
            case 0:
                this.f34970c.f36659q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34969b.h.invalidate();
                return;
            default:
                this.f34970c.f36659q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34969b.h.invalidate();
                return;
        }
    }
}
