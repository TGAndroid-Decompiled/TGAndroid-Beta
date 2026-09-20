package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class t61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28304a;
    public final View f28305b;

    public t61(int i10, View view) {
        this.f28304a = i10;
        this.f28305b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28304a) {
            case 0:
                u61 u61Var = (u61) this.f28305b;
                u61Var.getClass();
                u61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61Var.invalidate();
                return;
            case 1:
                a71 a71Var = (a71) this.f28305b;
                a71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71Var.f22580b = floatValue;
                a71Var.setTranslationY(floatValue);
                return;
            default:
                w81 w81Var = (w81) this.f28305b;
                w81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w81Var.setAnimationIdicatorProgress(floatValue2);
                v81 v81Var = w81Var.f30007y;
                if (v81Var != null) {
                    ((l.d) v81Var).M(floatValue2);
                    return;
                }
                return;
        }
    }
}
