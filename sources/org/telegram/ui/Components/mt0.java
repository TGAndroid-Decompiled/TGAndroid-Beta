package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27202a;
    public final qu0 f27203b;
    public final xv0 f27204c;

    public mt0(xv0 xv0Var, qu0 qu0Var, int i10) {
        this.f27202a = i10;
        this.f27204c = xv0Var;
        this.f27203b = qu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27202a) {
            case 0:
                this.f27204c.f31051n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27203b.h.invalidate();
                return;
            default:
                this.f27204c.f31051n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f27203b.h.invalidate();
                return;
        }
    }
}
