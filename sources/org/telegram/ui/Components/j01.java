package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class j01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35825a;
    public final v01 f35826b;

    public j01(v01 v01Var, int i7) {
        this.f35825a = i7;
        this.f35826b = v01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f35825a) {
            case 0:
                v01 v01Var = this.f35826b;
                v01Var.getClass();
                v01Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v01 v01Var2 = this.f35826b;
                v01Var2.T = floatValue;
                org.telegram.ui.b61 b61Var = v01Var2.Q;
                if (floatValue > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                b61Var.setVisibility(i7);
                b61Var.setAlpha(floatValue);
                b61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                v01Var2.b(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.f23603m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) v01Var2.f40226r.getLayoutParams()).topMargin = L;
                View view = v01Var2.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                v01Var2.h.requestLayout();
                return;
            default:
                v01 v01Var3 = this.f35826b;
                v01Var3.getClass();
                v01Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
