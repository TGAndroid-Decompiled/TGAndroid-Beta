package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xy implements ValueAnimator.AnimatorUpdateListener {
    public final int f40460a;
    public final cz f40461b;

    public xy(cz czVar, int i7) {
        this.f40460a = i7;
        this.f40461b = czVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40460a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz czVar = this.f40461b;
                czVar.f32724y = floatValue;
                czVar.invalidate();
                return;
            default:
                cz czVar2 = this.f40461b;
                czVar2.getClass();
                czVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar2.invalidate();
                return;
        }
    }
}
