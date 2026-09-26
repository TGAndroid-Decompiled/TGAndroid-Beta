package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30958a;
    public final du0 f30959b;
    public final kv0 f30960c;

    public zs0(kv0 kv0Var, du0 du0Var, int i10) {
        this.f30958a = i10;
        this.f30960c = kv0Var;
        this.f30959b = du0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30958a) {
            case 0:
                this.f30960c.f25848n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30959b.h.invalidate();
                return;
            default:
                this.f30960c.f25848n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30959b.h.invalidate();
                return;
        }
    }
}
