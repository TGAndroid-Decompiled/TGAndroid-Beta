package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26489a;
    public final l60 f26490b;

    public g60(l60 l60Var, int i10) {
        this.f26489a = i10;
        this.f26490b = l60Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26489a) {
            case 0:
                l60 l60Var = this.f26490b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * l60Var.getMeasuredHeight() * 0.5f;
                l60Var.f28114w0 = floatValue;
                l60Var.v.setTranslationY(floatValue + l60Var.f28112v0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l60 l60Var2 = this.f26490b;
                l60Var2.f28118y0 = floatValue2;
                si.s0 s0Var = l60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    return;
                }
                return;
        }
    }
}
