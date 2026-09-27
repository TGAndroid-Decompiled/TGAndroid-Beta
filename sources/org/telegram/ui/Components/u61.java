package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class u61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28818a;
    public final View f28819b;

    public u61(int i10, View view) {
        this.f28818a = i10;
        this.f28819b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28818a) {
            case 0:
                v61 v61Var = (v61) this.f28819b;
                v61Var.getClass();
                v61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.invalidate();
                return;
            case 1:
                c71 c71Var = (c71) this.f28819b;
                c71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.f23242b = floatValue;
                c71Var.setTranslationY(floatValue);
                return;
            default:
                x81 x81Var = (x81) this.f28819b;
                x81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x81Var.setAnimationIdicatorProgress(floatValue2);
                w81 w81Var = x81Var.f30377y;
                if (w81Var != null) {
                    ((l.d) w81Var).H(floatValue2);
                    return;
                }
                return;
        }
    }
}
