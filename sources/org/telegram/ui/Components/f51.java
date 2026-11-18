package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class f51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34948a;
    public final View f34949b;

    public f51(int i7, View view) {
        this.f34948a = i7;
        this.f34949b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34948a) {
            case 0:
                g51 g51Var = (g51) this.f34949b;
                g51Var.getClass();
                g51Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51Var.invalidate();
                return;
            case 1:
                m51 m51Var = (m51) this.f34949b;
                m51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.f37371b = floatValue;
                m51Var.setTranslationY(floatValue);
                return;
            default:
                f71 f71Var = (f71) this.f34949b;
                f71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.setAnimationIdicatorProgress(floatValue2);
                e71 e71Var = f71Var.E;
                if (e71Var != null) {
                    e71Var.g(floatValue2);
                    return;
                }
                return;
        }
    }
}
