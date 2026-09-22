package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24406a;
    public final i31 f24407b;

    public g31(i31 i31Var, int i10) {
        this.f24406a = i10;
        this.f24407b = i31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24406a) {
            case 0:
                ai.n4 n4Var = this.f24407b.f24955f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                i31 i31Var = this.f24407b;
                i31Var.getClass();
                i31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i31Var.h();
                return;
        }
    }
}
