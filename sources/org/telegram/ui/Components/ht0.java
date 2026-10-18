package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ht0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26933a;
    public final lu0 f26934b;
    public final sv0 f26935c;

    public ht0(sv0 sv0Var, lu0 lu0Var, int i10) {
        this.f26933a = i10;
        this.f26935c = sv0Var;
        this.f26934b = lu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26933a) {
            case 0:
                this.f26935c.f30370n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26934b.h.invalidate();
                return;
            default:
                this.f26935c.f30370n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26934b.h.invalidate();
                return;
        }
    }
}
