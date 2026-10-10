package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class v51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31740a;
    public final View f31741b;

    public v51(int i10, View view) {
        this.f31740a = i10;
        this.f31741b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31740a) {
            case 0:
                x51 x51Var = (x51) this.f31741b;
                x51Var.getClass();
                x51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var.invalidate();
                return;
            case 1:
                m71 m71Var = (m71) this.f31741b;
                m71Var.getClass();
                m71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m71Var.invalidate();
                return;
            case 2:
                s71 s71Var = (s71) this.f31741b;
                s71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s71Var.f30701b = floatValue;
                s71Var.setTranslationY(floatValue);
                return;
            default:
                o91 o91Var = (o91) this.f31741b;
                o91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o91Var.setAnimationIdicatorProgress(floatValue2);
                n91 n91Var = o91Var.f29427y;
                if (n91Var != null) {
                    ((m2.t) n91Var).D(floatValue2);
                    return;
                }
                return;
        }
    }
}
