package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28525a;
    public final View f28526b;

    public q51(int i10, View view) {
        this.f28525a = i10;
        this.f28526b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28525a) {
            case 0:
                s51 s51Var = (s51) this.f28526b;
                s51Var.getClass();
                s51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s51Var.invalidate();
                return;
            case 1:
                i71 i71Var = (i71) this.f28526b;
                i71Var.getClass();
                i71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i71Var.invalidate();
                return;
            case 2:
                o71 o71Var = (o71) this.f28526b;
                o71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o71Var.f27900b = floatValue;
                o71Var.setTranslationY(floatValue);
                return;
            default:
                j91 j91Var = (j91) this.f28526b;
                j91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j91Var.setAnimationIdicatorProgress(floatValue2);
                i91 i91Var = j91Var.f26299y;
                if (i91Var != null) {
                    ((l2.f) i91Var).j(floatValue2);
                    return;
                }
                return;
        }
    }
}
