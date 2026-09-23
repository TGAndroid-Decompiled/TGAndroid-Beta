package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ns0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26506a;
    public final rt0 f26507b;
    public final yu0 f26508c;

    public ns0(yu0 yu0Var, rt0 rt0Var, int i10) {
        this.f26506a = i10;
        this.f26508c = yu0Var;
        this.f26507b = rt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26506a) {
            case 0:
                this.f26508c.f30432n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26507b.h.invalidate();
                return;
            default:
                this.f26508c.f30432n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26507b.h.invalidate();
                return;
        }
    }
}
