package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f33673a;
    public final t f33674b;

    public n(t tVar, int i9) {
        this.f33673a = i9;
        this.f33674b = tVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f33673a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.f33674b;
                tVar.T = floatValue;
                tVar.U.setAlpha(floatValue);
                tVar.f33821a.invalidate();
                return;
            default:
                t tVar2 = this.f33674b;
                o oVar = tVar2.f33821a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !tVar2.G0) {
                    tVar2.f33847t0.setAlpha(1.0f);
                    tVar2.G0 = true;
                    oVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                tVar2.f33847t0.setRotationY(f10);
                oVar.d.setRotationY(f10);
                return;
        }
    }
}
