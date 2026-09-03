package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class p21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29949a;
    public final r21 f29950b;

    public p21(r21 r21Var, int i10) {
        this.f29949a = i10;
        this.f29950b = r21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29949a) {
            case 0:
                oh.b3 b3Var = this.f29950b.f30629f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                r21 r21Var = this.f29950b;
                r21Var.getClass();
                r21Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.h();
                return;
        }
    }
}
