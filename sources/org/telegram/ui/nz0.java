package org.telegram.ui;

import android.animation.ValueAnimator;
public final class nz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48146a;
    public final g11 f48147b;
    public final boolean f48148c;

    public nz0(g11 g11Var, boolean z10, int i3) {
        this.f48146a = i3;
        this.f48147b = g11Var;
        this.f48148c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48146a) {
            case 0:
                g11 g11Var = this.f48147b;
                e01 e01Var = g11Var.f45456i0;
                uz0 uz0Var = g11Var.f45458j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f48148c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                e01Var.setAlpha(f10);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                uz0Var.setAlpha(floatValue);
                uz0Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                g11Var.f45460k0.setAlpha(uz0Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f48148c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                g11 g11Var2 = this.f48147b;
                g11Var2.f45460k0.setAlpha(g11Var2.f45458j0.getAlpha() * floatValue2);
                return;
        }
    }
}
