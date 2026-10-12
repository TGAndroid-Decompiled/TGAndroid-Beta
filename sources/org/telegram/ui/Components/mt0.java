package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27499a;
    public final qu0 f27500b;
    public final xv0 f27501c;

    public mt0(xv0 xv0Var, qu0 qu0Var, int i10) {
        this.f27499a = i10;
        this.f27501c = xv0Var;
        this.f27500b = qu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27499a) {
            case 0:
                this.f27501c.f31370n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27500b.h.invalidate();
                return;
            default:
                this.f27501c.f31370n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27500b.h.invalidate();
                return;
        }
    }
}
