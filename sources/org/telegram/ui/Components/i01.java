package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class i01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34510a;
    public final t01 f34511b;

    public i01(t01 t01Var, int i7) {
        this.f34510a = i7;
        this.f34511b = t01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f34510a) {
            case 0:
                t01 t01Var = this.f34511b;
                t01Var.getClass();
                t01Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t01 t01Var2 = this.f34511b;
                t01Var2.S = floatValue;
                org.telegram.ui.f61 f61Var = t01Var2.P;
                if (floatValue > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                f61Var.setVisibility(i7);
                f61Var.setAlpha(floatValue);
                f61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                t01Var2.b(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.f22557m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) t01Var2.f38225r.getLayoutParams()).topMargin = L;
                View view = t01Var2.E;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                t01Var2.h.requestLayout();
                return;
            default:
                t01 t01Var3 = this.f34511b;
                t01Var3.getClass();
                t01Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
