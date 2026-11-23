package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class i51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36146a;
    public final View f36147b;

    public i51(int i7, View view) {
        this.f36146a = i7;
        this.f36147b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36146a) {
            case 0:
                j51 j51Var = (j51) this.f36147b;
                j51Var.getClass();
                j51Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51Var.invalidate();
                return;
            case 1:
                p51 p51Var = (p51) this.f36147b;
                p51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p51Var.f38510b = floatValue;
                p51Var.setTranslationY(floatValue);
                return;
            default:
                i71 i71Var = (i71) this.f36147b;
                i71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i71Var.setAnimationIdicatorProgress(floatValue2);
                h71 h71Var = i71Var.E;
                if (h71Var != null) {
                    h71Var.g(floatValue2);
                    return;
                }
                return;
        }
    }
}
