package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class r51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30108a;
    public final View f30109b;

    public r51(int i10, View view) {
        this.f30108a = i10;
        this.f30109b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30108a) {
            case 0:
                t51 t51Var = (t51) this.f30109b;
                t51Var.getClass();
                t51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t51Var.invalidate();
                return;
            case 1:
                k71 k71Var = (k71) this.f30109b;
                k71Var.getClass();
                k71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k71Var.invalidate();
                return;
            case 2:
                q71 q71Var = (q71) this.f30109b;
                q71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q71Var.f29784b = floatValue;
                q71Var.setTranslationY(floatValue);
                return;
            default:
                k91 k91Var = (k91) this.f30109b;
                k91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.setAnimationIdicatorProgress(floatValue2);
                j91 j91Var = k91Var.f27986y;
                if (j91Var != null) {
                    ((l2.f) j91Var).I(floatValue2);
                    return;
                }
                return;
        }
    }
}
