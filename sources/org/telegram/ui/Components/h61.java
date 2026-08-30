package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class h61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25334a;
    public final View f25335b;

    public h61(int i10, View view) {
        this.f25334a = i10;
        this.f25335b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25334a) {
            case 0:
                i61 i61Var = (i61) this.f25335b;
                i61Var.getClass();
                i61Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61Var.invalidate();
                return;
            case 1:
                o61 o61Var = (o61) this.f25335b;
                o61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o61Var.f27456b = floatValue;
                o61Var.setTranslationY(floatValue);
                return;
            default:
                k81 k81Var = (k81) this.f25335b;
                k81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k81Var.setAnimationIdicatorProgress(floatValue2);
                j81 j81Var = k81Var.f26229y;
                if (j81Var != null) {
                    ((o2.o) j81Var).q(floatValue2);
                    return;
                }
                return;
        }
    }
}
