package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xy implements ValueAnimator.AnimatorUpdateListener {
    public final int f40432a;
    public final cz f40433b;

    public xy(cz czVar, int i7) {
        this.f40432a = i7;
        this.f40433b = czVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40432a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz czVar = this.f40433b;
                czVar.f32826y = floatValue;
                czVar.invalidate();
                return;
            default:
                cz czVar2 = this.f40433b;
                czVar2.getClass();
                czVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar2.invalidate();
                return;
        }
    }
}
