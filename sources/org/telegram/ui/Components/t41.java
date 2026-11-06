package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class t41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38250a;
    public final FrameLayout f38251b;

    public t41(int i7, FrameLayout frameLayout) {
        this.f38250a = i7;
        this.f38251b = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38250a) {
            case 0:
                u41 u41Var = (u41) this.f38251b;
                u41Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.f38522b = floatValue;
                u41Var.setTranslationY(floatValue);
                return;
            default:
                o61 o61Var = (o61) this.f38251b;
                o61Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o61Var.setAnimationIdicatorProgress(floatValue2);
                n61 n61Var = o61Var.D;
                if (n61Var != null) {
                    ((n) n61Var).y(floatValue2);
                    return;
                }
                return;
        }
    }
}
