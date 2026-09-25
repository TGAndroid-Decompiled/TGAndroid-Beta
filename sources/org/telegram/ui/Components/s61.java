package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class s61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28170a;
    public final View f28171b;

    public s61(int i10, View view) {
        this.f28170a = i10;
        this.f28171b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28170a) {
            case 0:
                t61 t61Var = (t61) this.f28171b;
                t61Var.getClass();
                t61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61Var.invalidate();
                return;
            case 1:
                z61 z61Var = (z61) this.f28171b;
                z61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z61Var.f30801b = floatValue;
                z61Var.setTranslationY(floatValue);
                return;
            default:
                v81 v81Var = (v81) this.f28171b;
                v81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v81Var.setAnimationIdicatorProgress(floatValue2);
                u81 u81Var = v81Var.f29107y;
                if (u81Var != null) {
                    ((l.d) u81Var).L(floatValue2);
                    return;
                }
                return;
        }
    }
}
