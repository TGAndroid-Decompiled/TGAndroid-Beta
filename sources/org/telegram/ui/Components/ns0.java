package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ns0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29618a;
    public final rt0 f29619b;
    public final zu0 f29620c;

    public ns0(zu0 zu0Var, rt0 rt0Var, int i10) {
        this.f29618a = i10;
        this.f29620c = zu0Var;
        this.f29619b = rt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29618a) {
            case 0:
                this.f29620c.f33987k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f29619b.h.invalidate();
                return;
            default:
                this.f29620c.f33987k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f29619b.h.invalidate();
                return;
        }
    }
}
