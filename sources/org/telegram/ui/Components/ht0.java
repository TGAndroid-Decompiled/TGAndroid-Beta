package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ht0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26940a;
    public final lu0 f26941b;
    public final sv0 f26942c;

    public ht0(sv0 sv0Var, lu0 lu0Var, int i10) {
        this.f26940a = i10;
        this.f26942c = sv0Var;
        this.f26941b = lu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26940a) {
            case 0:
                this.f26942c.f30377n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26941b.h.invalidate();
                return;
            default:
                this.f26942c.f30377n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f26941b.h.invalidate();
                return;
        }
    }
}
