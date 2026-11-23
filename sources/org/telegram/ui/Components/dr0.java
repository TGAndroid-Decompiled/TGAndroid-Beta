package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34436a;
    public final ds0 f34437b;
    public final it0 f34438c;

    public dr0(it0 it0Var, ds0 ds0Var, int i7) {
        this.f34436a = i7;
        this.f34438c = it0Var;
        this.f34437b = ds0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34436a) {
            case 0:
                this.f34438c.f36142q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34437b.h.invalidate();
                return;
            default:
                this.f34438c.f36142q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34437b.h.invalidate();
                return;
        }
    }
}
