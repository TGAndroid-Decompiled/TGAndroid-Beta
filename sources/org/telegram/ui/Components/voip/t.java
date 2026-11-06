package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f39475a;
    public final y f39476b;

    public t(y yVar, int i7) {
        this.f39475a = i7;
        this.f39476b = yVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        switch (this.f39475a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.f39476b;
                yVar.f39573a0 = floatValue;
                yVar.f39575b0.setAlpha(floatValue);
                yVar.f39572a.invalidate();
                return;
            default:
                y yVar2 = this.f39476b;
                u uVar = yVar2.f39572a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z9 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z9 = true;
                }
                if (z9 && !yVar2.K0) {
                    yVar2.f39604x0.setAlpha(1.0f);
                    yVar2.K0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.f39604x0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                return;
        }
    }
}
