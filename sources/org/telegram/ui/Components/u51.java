package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class u51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31376a;
    public final View f31377b;

    public u51(int i10, View view) {
        this.f31376a = i10;
        this.f31377b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31376a) {
            case 0:
                w51 w51Var = (w51) this.f31377b;
                w51Var.getClass();
                w51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.invalidate();
                return;
            case 1:
                l71 l71Var = (l71) this.f31377b;
                l71Var.getClass();
                l71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.invalidate();
                return;
            case 2:
                r71 r71Var = (r71) this.f31377b;
                r71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r71Var.f30379b = floatValue;
                r71Var.setTranslationY(floatValue);
                return;
            default:
                n91 n91Var = (n91) this.f31377b;
                n91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n91Var.setAnimationIdicatorProgress(floatValue2);
                m91 m91Var = n91Var.f29122y;
                if (m91Var != null) {
                    ((m2.t) m91Var).D(floatValue2);
                    return;
                }
                return;
        }
    }
}
