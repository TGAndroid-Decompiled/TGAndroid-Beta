package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class es0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28171a;
    public final it0 f28172b;
    public final qu0 f28173c;

    public es0(qu0 qu0Var, it0 it0Var, int i10) {
        this.f28171a = i10;
        this.f28173c = qu0Var;
        this.f28172b = it0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28171a) {
            case 0:
                this.f28173c.f32077j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28172b.h.invalidate();
                return;
            default:
                this.f28173c.f32077j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28172b.h.invalidate();
                return;
        }
    }
}
