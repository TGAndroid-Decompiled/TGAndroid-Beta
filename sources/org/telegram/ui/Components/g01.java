package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class g01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33702a;
    public final r01 f33703b;

    public g01(r01 r01Var, int i7) {
        this.f33702a = i7;
        this.f33703b = r01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f33702a) {
            case 0:
                r01 r01Var = this.f33703b;
                r01Var.getClass();
                r01Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01 r01Var2 = this.f33703b;
                r01Var2.T = floatValue;
                org.telegram.ui.e61 e61Var = r01Var2.P;
                if (floatValue > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                e61Var.setVisibility(i7);
                e61Var.setAlpha(floatValue);
                e61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                r01Var2.b(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.f22531m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) r01Var2.f37471r.getLayoutParams()).topMargin = L;
                View view = r01Var2.E;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                r01Var2.h.requestLayout();
                return;
            default:
                r01 r01Var3 = this.f33703b;
                r01Var3.getClass();
                r01Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
