package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23006a;
    public final fu0 f23007b;
    public final mv0 f23008c;

    public bt0(mv0 mv0Var, fu0 fu0Var, int i10) {
        this.f23006a = i10;
        this.f23008c = mv0Var;
        this.f23007b = fu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23006a) {
            case 0:
                this.f23008c.f26431n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f23007b.h.invalidate();
                return;
            default:
                this.f23008c.f26431n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f23007b.h.invalidate();
                return;
        }
    }
}
