package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29643a;
    public final View f29644b;

    public j51(int i9, View view) {
        this.f29643a = i9;
        this.f29644b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29643a) {
            case 0:
                k51 k51Var = (k51) this.f29644b;
                k51Var.getClass();
                k51Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51Var.invalidate();
                return;
            case 1:
                q51 q51Var = (q51) this.f29644b;
                q51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q51Var.f31836b = floatValue;
                q51Var.setTranslationY(floatValue);
                return;
            default:
                m71 m71Var = (m71) this.f29644b;
                m71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m71Var.setAnimationIdicatorProgress(floatValue2);
                l71 l71Var = m71Var.f30759y;
                if (l71Var != null) {
                    ((n2.p) l71Var).F(floatValue2);
                    return;
                }
                return;
        }
    }
}
