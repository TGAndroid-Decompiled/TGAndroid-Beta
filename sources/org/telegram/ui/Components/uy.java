package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uy implements ValueAnimator.AnimatorUpdateListener {
    public final int f38909a;
    public final zy f38910b;

    public uy(zy zyVar, int i3) {
        this.f38909a = i3;
        this.f38910b = zyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38909a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy zyVar = this.f38910b;
                zyVar.f41169y = floatValue;
                zyVar.invalidate();
                return;
            default:
                zy zyVar2 = this.f38910b;
                zyVar2.getClass();
                zyVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zyVar2.invalidate();
                return;
        }
    }
}
