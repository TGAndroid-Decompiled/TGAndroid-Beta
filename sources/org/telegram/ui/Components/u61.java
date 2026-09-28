package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class u61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28757a;
    public final View f28758b;

    public u61(int i10, View view) {
        this.f28757a = i10;
        this.f28758b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28757a) {
            case 0:
                v61 v61Var = (v61) this.f28758b;
                v61Var.getClass();
                v61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.invalidate();
                return;
            case 1:
                b71 b71Var = (b71) this.f28758b;
                b71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b71Var.f22884b = floatValue;
                b71Var.setTranslationY(floatValue);
                return;
            default:
                x81 x81Var = (x81) this.f28758b;
                x81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x81Var.setAnimationIdicatorProgress(floatValue2);
                w81 w81Var = x81Var.f30348y;
                if (w81Var != null) {
                    ((l.d) w81Var).L(floatValue2);
                    return;
                }
                return;
        }
    }
}
