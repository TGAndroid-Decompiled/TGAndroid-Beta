package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class v61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28994a;
    public final View f28995b;

    public v61(int i10, View view) {
        this.f28994a = i10;
        this.f28995b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28994a) {
            case 0:
                w61 w61Var = (w61) this.f28995b;
                w61Var.getClass();
                w61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.invalidate();
                return;
            case 1:
                c71 c71Var = (c71) this.f28995b;
                c71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.f23289b = floatValue;
                c71Var.setTranslationY(floatValue);
                return;
            default:
                y81 y81Var = (y81) this.f28995b;
                y81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y81Var.setAnimationIdicatorProgress(floatValue2);
                x81 x81Var = y81Var.f30609y;
                if (x81Var != null) {
                    ((ki.e0) x81Var).i(floatValue2);
                    return;
                }
                return;
        }
    }
}
