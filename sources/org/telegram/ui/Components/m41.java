package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class m41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35998a;
    public final View f35999b;

    public m41(int i3, View view) {
        this.f35998a = i3;
        this.f35999b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35998a) {
            case 0:
                n41 n41Var = (n41) this.f35999b;
                n41Var.getClass();
                n41Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.invalidate();
                return;
            case 1:
                t41 t41Var = (t41) this.f35999b;
                t41Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t41Var.f38249b = floatValue;
                t41Var.setTranslationY(floatValue);
                return;
            default:
                m61 m61Var = (m61) this.f35999b;
                m61Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.setAnimationIdicatorProgress(floatValue2);
                l61 l61Var = m61Var.E;
                if (l61Var != null) {
                    ((y00) l61Var).x(floatValue2);
                    return;
                }
                return;
        }
    }
}
