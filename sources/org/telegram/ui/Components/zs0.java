package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30866a;
    public final du0 f30867b;
    public final kv0 f30868c;

    public zs0(kv0 kv0Var, du0 du0Var, int i10) {
        this.f30866a = i10;
        this.f30868c = kv0Var;
        this.f30867b = du0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30866a) {
            case 0:
                this.f30868c.f25830n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30867b.h.invalidate();
                return;
            default:
                this.f30868c.f25830n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30867b.h.invalidate();
                return;
        }
    }
}
