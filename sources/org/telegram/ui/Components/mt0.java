package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28752a;
    public final qu0 f28753b;
    public final xv0 f28754c;

    public mt0(xv0 xv0Var, qu0 qu0Var, int i10) {
        this.f28752a = i10;
        this.f28754c = xv0Var;
        this.f28753b = qu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28752a) {
            case 0:
                this.f28754c.f32693n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28753b.h.invalidate();
                return;
            default:
                this.f28754c.f32693n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28753b.h.invalidate();
                return;
        }
    }
}
