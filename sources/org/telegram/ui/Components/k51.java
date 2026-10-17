package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class k51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27750a;
    public final View f27751b;

    public k51(int i10, View view) {
        this.f27750a = i10;
        this.f27751b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27750a) {
            case 0:
                m51 m51Var = (m51) this.f27751b;
                m51Var.getClass();
                m51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.invalidate();
                return;
            case 1:
                b71 b71Var = (b71) this.f27751b;
                b71Var.getClass();
                b71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b71Var.invalidate();
                return;
            case 2:
                h71 h71Var = (h71) this.f27751b;
                h71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h71Var.f26788b = floatValue;
                h71Var.setTranslationY(floatValue);
                return;
            default:
                b91 b91Var = (b91) this.f27751b;
                b91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b91Var.setAnimationIdicatorProgress(floatValue2);
                a91 a91Var = b91Var.f24871y;
                if (a91Var != null) {
                    ((l2.f) a91Var).z(floatValue2);
                    return;
                }
                return;
        }
    }
}
