package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class f71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26423a;
    public final View f26424b;

    public f71(int i10, View view) {
        this.f26423a = i10;
        this.f26424b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26423a) {
            case 0:
                g71 g71Var = (g71) this.f26424b;
                g71Var.getClass();
                g71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var.invalidate();
                return;
            case 1:
                m71 m71Var = (m71) this.f26424b;
                m71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m71Var.f28622b = floatValue;
                m71Var.setTranslationY(floatValue);
                return;
            default:
                g91 g91Var = (g91) this.f26424b;
                g91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g91Var.setAnimationIdicatorProgress(floatValue2);
                f91 f91Var = g91Var.f26794y;
                if (f91Var != null) {
                    ((n2.c) f91Var).k(floatValue2);
                    return;
                }
                return;
        }
    }
}
