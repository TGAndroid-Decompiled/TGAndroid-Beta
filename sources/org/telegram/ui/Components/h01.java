package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class h01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34114a;
    public final s01 f34115b;

    public h01(s01 s01Var, int i7) {
        this.f34114a = i7;
        this.f34115b = s01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f34114a) {
            case 0:
                s01 s01Var = this.f34115b;
                s01Var.getClass();
                s01Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01 s01Var2 = this.f34115b;
                s01Var2.S = floatValue;
                org.telegram.ui.g61 g61Var = s01Var2.P;
                if (floatValue > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                g61Var.setVisibility(i7);
                g61Var.setAlpha(floatValue);
                g61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                s01Var2.b(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.f22561m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) s01Var2.f37809r.getLayoutParams()).topMargin = L;
                View view = s01Var2.E;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                s01Var2.h.requestLayout();
                return;
            default:
                s01 s01Var3 = this.f34115b;
                s01Var3.getClass();
                s01Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
