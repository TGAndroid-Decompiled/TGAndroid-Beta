package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f41355a;
    public final y f41356b;

    public t(y yVar, int i7) {
        this.f41355a = i7;
        this.f41356b = yVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f41355a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.f41356b;
                yVar.f41464b0 = floatValue;
                yVar.f41466c0.setAlpha(floatValue);
                yVar.f41461a.invalidate();
                return;
            default:
                y yVar2 = this.f41356b;
                u uVar = yVar2.f41461a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !yVar2.L0) {
                    yVar2.f41495y0.setAlpha(1.0f);
                    yVar2.L0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.f41495y0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                return;
        }
    }
}
