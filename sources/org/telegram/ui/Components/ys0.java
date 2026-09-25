package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ys0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30682a;
    public final cu0 f30683b;
    public final jv0 f30684c;

    public ys0(jv0 jv0Var, cu0 cu0Var, int i10) {
        this.f30682a = i10;
        this.f30684c = jv0Var;
        this.f30683b = cu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30682a) {
            case 0:
                this.f30684c.f25542n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30683b.h.invalidate();
                return;
            default:
                this.f30684c.f25542n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30683b.h.invalidate();
                return;
        }
    }
}
