package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32782a;
    public final xs0 f32783b;
    public final eu0 f32784c;

    public tr0(eu0 eu0Var, xs0 xs0Var, int i9) {
        this.f32782a = i9;
        this.f32784c = eu0Var;
        this.f32783b = xs0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32782a) {
            case 0:
                this.f32784c.f28144j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f32783b.h.invalidate();
                return;
            default:
                this.f32784c.f28144j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f32783b.h.invalidate();
                return;
        }
    }
}
