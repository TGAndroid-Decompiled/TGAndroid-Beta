package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class er0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34952a;
    public final ds0 f34953b;
    public final jt0 f34954c;

    public er0(jt0 jt0Var, ds0 ds0Var, int i7) {
        this.f34952a = i7;
        this.f34954c = jt0Var;
        this.f34953b = ds0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34952a) {
            case 0:
                this.f34954c.f36614q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34953b.h.invalidate();
                return;
            default:
                this.f34954c.f36614q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34953b.h.invalidate();
                return;
        }
    }
}
