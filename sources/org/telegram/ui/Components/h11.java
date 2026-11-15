package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35148a;
    public final k11 f35149b;

    public h11(k11 k11Var, int i7) {
        this.f35148a = i7;
        this.f35149b = k11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35148a) {
            case 0:
                fi.w2 w2Var = this.f35149b.f36240f;
                w2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                w2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                w2Var.invalidate();
                return;
            default:
                k11 k11Var = this.f35149b;
                k11Var.getClass();
                k11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var.h();
                return;
        }
    }
}
