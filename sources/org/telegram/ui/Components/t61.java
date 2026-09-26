package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class t61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28475a;
    public final View f28476b;

    public t61(int i10, View view) {
        this.f28475a = i10;
        this.f28476b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28475a) {
            case 0:
                u61 u61Var = (u61) this.f28476b;
                u61Var.getClass();
                u61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61Var.invalidate();
                return;
            case 1:
                a71 a71Var = (a71) this.f28476b;
                a71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71Var.f22558b = floatValue;
                a71Var.setTranslationY(floatValue);
                return;
            default:
                w81 w81Var = (w81) this.f28476b;
                w81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w81Var.setAnimationIdicatorProgress(floatValue2);
                v81 v81Var = w81Var.f29957y;
                if (v81Var != null) {
                    ((l.d) v81Var).L(floatValue2);
                    return;
                }
                return;
        }
    }
}
