package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32435a;
    public final w2 f32436b;

    public v2(w2 w2Var, int i10) {
        this.f32435a = i10;
        this.f32436b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32435a) {
            case 0:
                w2 w2Var = this.f32436b;
                w2Var.getClass();
                w2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.a(w2Var.O, w2Var.P);
                return;
            default:
                w2 w2Var2 = this.f32436b;
                w2Var2.getClass();
                w2Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.invalidate();
                return;
        }
    }
}
