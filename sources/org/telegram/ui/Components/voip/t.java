package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f39617a;
    public final y f39618b;

    public t(y yVar, int i7) {
        this.f39617a = i7;
        this.f39618b = yVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        switch (this.f39617a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.f39618b;
                yVar.f39715a0 = floatValue;
                yVar.f39717b0.setAlpha(floatValue);
                yVar.f39714a.invalidate();
                return;
            default:
                y yVar2 = this.f39618b;
                u uVar = yVar2.f39714a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z9 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z9 = true;
                }
                if (z9 && !yVar2.K0) {
                    yVar2.f39746x0.setAlpha(1.0f);
                    yVar2.K0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.f39746x0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                return;
        }
    }
}
