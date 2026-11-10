package org.telegram.ui;

import android.animation.ValueAnimator;
public final class a01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43511a;
    public final t11 f43512b;
    public final boolean f43513c;

    public a01(t11 t11Var, boolean z9, int i7) {
        this.f43511a = i7;
        this.f43512b = t11Var;
        this.f43513c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43511a) {
            case 0:
                t11 t11Var = this.f43512b;
                r01 r01Var = t11Var.f50036h0;
                h01 h01Var = t11Var.f50038i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f43513c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                r01Var.setAlpha(f10);
                r01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                h01Var.setAlpha(floatValue);
                h01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                t11Var.f50040j0.setAlpha(h01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f43513c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                t11 t11Var2 = this.f43512b;
                t11Var2.f50040j0.setAlpha(t11Var2.f50038i0.getAlpha() * floatValue2);
                return;
        }
    }
}
