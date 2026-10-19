package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class l51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28084a;
    public final View f28085b;

    public l51(int i10, View view) {
        this.f28084a = i10;
        this.f28085b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28084a) {
            case 0:
                n51 n51Var = (n51) this.f28085b;
                n51Var.getClass();
                n51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n51Var.invalidate();
                return;
            case 1:
                c71 c71Var = (c71) this.f28085b;
                c71Var.getClass();
                c71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.invalidate();
                return;
            case 2:
                i71 i71Var = (i71) this.f28085b;
                i71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i71Var.f27098b = floatValue;
                i71Var.setTranslationY(floatValue);
                return;
            default:
                c91 c91Var = (c91) this.f28085b;
                c91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c91Var.setAnimationIdicatorProgress(floatValue2);
                b91 b91Var = c91Var.f25151y;
                if (b91Var != null) {
                    ((l2.f) b91Var).I(floatValue2);
                    return;
                }
                return;
        }
    }
}
