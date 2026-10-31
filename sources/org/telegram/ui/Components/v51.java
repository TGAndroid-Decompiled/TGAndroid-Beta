package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class v51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31147a;
    public final View f31148b;

    public v51(int i10, View view) {
        this.f31147a = i10;
        this.f31148b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31147a) {
            case 0:
                w51 w51Var = (w51) this.f31148b;
                w51Var.getClass();
                w51Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.invalidate();
                return;
            case 1:
                c61 c61Var = (c61) this.f31148b;
                c61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c61Var.f25011b = floatValue;
                c61Var.setTranslationY(floatValue);
                return;
            default:
                v71 v71Var = (v71) this.f31148b;
                v71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.setAnimationIdicatorProgress(floatValue2);
                u71 u71Var = v71Var.D;
                if (u71Var != null) {
                    ((n2.u) u71Var).J(floatValue2);
                    return;
                }
                return;
        }
    }
}
