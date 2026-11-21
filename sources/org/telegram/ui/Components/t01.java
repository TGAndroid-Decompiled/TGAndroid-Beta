package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class t01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39752a;
    public final h11 f39753b;

    public t01(h11 h11Var, int i7) {
        this.f39752a = i7;
        this.f39753b = h11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f39752a) {
            case 0:
                h11 h11Var = this.f39753b;
                h11Var.getClass();
                h11Var.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h11 h11Var2 = this.f39753b;
                h11Var2.f35727a0 = floatValue;
                org.telegram.ui.f61 f61Var = h11Var2.S;
                if (floatValue > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                f61Var.setVisibility(i7);
                f61Var.setAlpha(floatValue);
                f61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                h11Var2.c(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.f24140m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) h11Var2.f35748r.getLayoutParams()).topMargin = L;
                View view = h11Var2.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                h11Var2.h.requestLayout();
                return;
            default:
                h11 h11Var3 = this.f39753b;
                h11Var3.getClass();
                h11Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
