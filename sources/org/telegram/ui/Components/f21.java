package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28292a;
    public final h21 f28293b;

    public f21(h21 h21Var, int i10) {
        this.f28292a = i10;
        this.f28293b = h21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28292a) {
            case 0:
                lh.z2 z2Var = this.f28293b.f29041f;
                z2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                z2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                z2Var.invalidate();
                return;
            default:
                h21 h21Var = this.f28293b;
                h21Var.getClass();
                h21Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h21Var.h();
                return;
        }
    }
}
