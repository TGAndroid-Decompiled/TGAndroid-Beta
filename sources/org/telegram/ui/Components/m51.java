package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class m51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28392a;
    public final View f28393b;

    public m51(int i10, View view) {
        this.f28392a = i10;
        this.f28393b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28392a) {
            case 0:
                o51 o51Var = (o51) this.f28393b;
                o51Var.getClass();
                o51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.invalidate();
                return;
            case 1:
                d71 d71Var = (d71) this.f28393b;
                d71Var.getClass();
                d71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d71Var.invalidate();
                return;
            case 2:
                j71 j71Var = (j71) this.f28393b;
                j71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.f27424b = floatValue;
                j71Var.setTranslationY(floatValue);
                return;
            default:
                d91 d91Var = (d91) this.f28393b;
                d91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var.setAnimationIdicatorProgress(floatValue2);
                c91 c91Var = d91Var.f25421y;
                if (c91Var != null) {
                    ((l2.f) c91Var).I(floatValue2);
                    return;
                }
                return;
        }
    }
}
