package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30675a;
    public final ss0 f30676b;
    public final zt0 f30677c;

    public tr0(zt0 zt0Var, ss0 ss0Var, int i10) {
        this.f30675a = i10;
        this.f30677c = zt0Var;
        this.f30676b = ss0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30675a) {
            case 0:
                this.f30677c.f33217p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30676b.h.invalidate();
                return;
            default:
                this.f30677c.f33217p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30676b.h.invalidate();
                return;
        }
    }
}
