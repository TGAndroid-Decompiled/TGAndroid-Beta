package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v50 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28934a;
    public final z50 f28935b;

    public v50(z50 z50Var, int i10) {
        this.f28934a = i10;
        this.f28935b = z50Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28934a) {
            case 0:
                z50 z50Var = this.f28935b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * z50Var.getMeasuredHeight() * 0.5f;
                z50Var.f30725k0 = floatValue;
                z50Var.f30732r.setTranslationY(floatValue + z50Var.f30724j0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z50 z50Var2 = this.f28935b;
                z50Var2.m0 = floatValue2;
                ki.o0 o0Var = z50Var2.K;
                if (o0Var != null) {
                    o0Var.v(floatValue2);
                    return;
                }
                return;
        }
    }
}
