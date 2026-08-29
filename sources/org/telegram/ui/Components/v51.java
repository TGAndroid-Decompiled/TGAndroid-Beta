package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class v51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33465a;
    public final View f33466b;

    public v51(int i10, View view) {
        this.f33465a = i10;
        this.f33466b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33465a) {
            case 0:
                w51 w51Var = (w51) this.f33466b;
                w51Var.getClass();
                w51Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.invalidate();
                return;
            case 1:
                d61 d61Var = (d61) this.f33466b;
                d61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d61Var.f27679b = floatValue;
                d61Var.setTranslationY(floatValue);
                return;
            default:
                y71 y71Var = (y71) this.f33466b;
                y71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y71Var.setAnimationIdicatorProgress(floatValue2);
                x71 x71Var = y71Var.f34963y;
                if (x71Var != null) {
                    ((n) x71Var).j(floatValue2);
                    return;
                }
                return;
        }
    }
}
