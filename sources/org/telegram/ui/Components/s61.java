package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class s61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26959a;
    public final View f26960b;

    public s61(int i10, View view) {
        this.f26959a = i10;
        this.f26960b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26959a) {
            case 0:
                t61 t61Var = (t61) this.f26960b;
                t61Var.getClass();
                t61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61Var.invalidate();
                return;
            case 1:
                z61 z61Var = (z61) this.f26960b;
                z61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z61Var.f29606b = floatValue;
                z61Var.setTranslationY(floatValue);
                return;
            default:
                u81 u81Var = (u81) this.f26960b;
                u81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u81Var.setAnimationIdicatorProgress(floatValue2);
                t81 t81Var = u81Var.f27640y;
                if (t81Var != null) {
                    ((l2.h) t81Var).z(floatValue2);
                    return;
                }
                return;
        }
    }
}
