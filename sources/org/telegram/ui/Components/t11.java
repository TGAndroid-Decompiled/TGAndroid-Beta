package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32595a;
    public final v11 f32596b;

    public t11(v11 v11Var, int i9) {
        this.f32595a = i9;
        this.f32596b = v11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32595a) {
            case 0:
                ih.b3 b3Var = this.f32596b.f33230f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                v11 v11Var = this.f32596b;
                v11Var.getClass();
                v11Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v11Var.h();
                return;
        }
    }
}
