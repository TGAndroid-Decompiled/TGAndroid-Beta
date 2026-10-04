package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class d71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25614a;
    public final View f25615b;

    public d71(int i10, View view) {
        this.f25614a = i10;
        this.f25615b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25614a) {
            case 0:
                e71 e71Var = (e71) this.f25615b;
                e71Var.getClass();
                e71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e71Var.invalidate();
                return;
            case 1:
                l71 l71Var = (l71) this.f25615b;
                l71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.f28298b = floatValue;
                l71Var.setTranslationY(floatValue);
                return;
            default:
                f91 f91Var = (f91) this.f25615b;
                f91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f91Var.setAnimationIdicatorProgress(floatValue2);
                e91 e91Var = f91Var.f26419y;
                if (e91Var != null) {
                    ((n2.c) e91Var).k(floatValue2);
                    return;
                }
                return;
        }
    }
}
