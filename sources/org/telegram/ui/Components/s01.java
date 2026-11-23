package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class s01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39393a;
    public final g11 f39394b;

    public s01(g11 g11Var, int i7) {
        this.f39393a = i7;
        this.f39394b = g11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f39393a) {
            case 0:
                g11 g11Var = this.f39394b;
                g11Var.getClass();
                g11Var.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11 g11Var2 = this.f39394b;
                g11Var2.f35328a0 = floatValue;
                org.telegram.ui.f61 f61Var = g11Var2.S;
                if (floatValue > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                f61Var.setVisibility(i7);
                f61Var.setAlpha(floatValue);
                f61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                g11Var2.c(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.f24004m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) g11Var2.f35349r.getLayoutParams()).topMargin = L;
                View view = g11Var2.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                g11Var2.h.requestLayout();
                return;
            default:
                g11 g11Var3 = this.f39394b;
                g11Var3.getClass();
                g11Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
