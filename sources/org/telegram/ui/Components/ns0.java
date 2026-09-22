package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ns0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26566a;
    public final rt0 f26567b;
    public final yu0 f26568c;

    public ns0(yu0 yu0Var, rt0 rt0Var, int i10) {
        this.f26566a = i10;
        this.f26568c = yu0Var;
        this.f26567b = rt0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26566a) {
            case 0:
                this.f26568c.f30371n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26567b.h.invalidate();
                return;
            default:
                this.f26568c.f30371n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26567b.h.invalidate();
                return;
        }
    }
}
