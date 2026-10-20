package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class m51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28388a;
    public final View f28389b;

    public m51(int i10, View view) {
        this.f28388a = i10;
        this.f28389b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28388a) {
            case 0:
                o51 o51Var = (o51) this.f28389b;
                o51Var.getClass();
                o51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.invalidate();
                return;
            case 1:
                d71 d71Var = (d71) this.f28389b;
                d71Var.getClass();
                d71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d71Var.invalidate();
                return;
            case 2:
                j71 j71Var = (j71) this.f28389b;
                j71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.f27420b = floatValue;
                j71Var.setTranslationY(floatValue);
                return;
            default:
                d91 d91Var = (d91) this.f28389b;
                d91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var.setAnimationIdicatorProgress(floatValue2);
                c91 c91Var = d91Var.f25417y;
                if (c91Var != null) {
                    ((l2.f) c91Var).I(floatValue2);
                    return;
                }
                return;
        }
    }
}
