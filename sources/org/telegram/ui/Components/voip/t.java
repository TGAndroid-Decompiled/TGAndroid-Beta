package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f41356a;
    public final y f41357b;

    public t(y yVar, int i7) {
        this.f41356a = i7;
        this.f41357b = yVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f41356a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.f41357b;
                yVar.f41465b0 = floatValue;
                yVar.f41467c0.setAlpha(floatValue);
                yVar.f41462a.invalidate();
                return;
            default:
                y yVar2 = this.f41357b;
                u uVar = yVar2.f41462a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !yVar2.L0) {
                    yVar2.f41496y0.setAlpha(1.0f);
                    yVar2.L0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.f41496y0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                return;
        }
    }
}
