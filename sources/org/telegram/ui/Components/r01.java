package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class r01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39142a;
    public final f11 f39143b;

    public r01(f11 f11Var, int i7) {
        this.f39142a = i7;
        this.f39143b = f11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f39142a) {
            case 0:
                f11 f11Var = this.f39143b;
                f11Var.getClass();
                f11Var.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f11 f11Var2 = this.f39143b;
                f11Var2.f34947a0 = floatValue;
                org.telegram.ui.d61 d61Var = f11Var2.S;
                if (floatValue > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                d61Var.setVisibility(i7);
                d61Var.setAlpha(floatValue);
                d61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                f11Var2.c(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.f24220m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) f11Var2.f34968r.getLayoutParams()).topMargin = L;
                View view = f11Var2.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                f11Var2.h.requestLayout();
                return;
            default:
                f11 f11Var3 = this.f39143b;
                f11Var3.getClass();
                f11Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
