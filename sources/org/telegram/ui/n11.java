package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39811a;
    public final i31 f39812b;
    public final boolean f39813c;

    public n11(i31 i31Var, boolean z10, int i10) {
        this.f39811a = i10;
        this.f39812b = i31Var;
        this.f39813c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39811a) {
            case 0:
                i31 i31Var = this.f39812b;
                g21 g21Var = i31Var.f38129h0;
                v11 v11Var = i31Var.f38131i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39813c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g21Var.setAlpha(f7);
                g21Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * floatValue);
                v11Var.setAlpha(floatValue);
                v11Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * f7);
                i31Var.f38133j0.setAlpha(v11Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f39813c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                i31 i31Var2 = this.f39812b;
                i31Var2.f38133j0.setAlpha(i31Var2.f38131i0.getAlpha() * floatValue2);
                return;
        }
    }
}
