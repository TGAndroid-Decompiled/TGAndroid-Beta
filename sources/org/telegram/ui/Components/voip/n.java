package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f31665a;
    public final t f31666b;

    public n(t tVar, int i10) {
        this.f31665a = i10;
        this.f31666b = tVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f31665a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.f31666b;
                tVar.f31805a0 = floatValue;
                tVar.f31807b0.setAlpha(floatValue);
                tVar.f31804a.invalidate();
                return;
            default:
                t tVar2 = this.f31666b;
                o oVar = tVar2.f31804a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !tVar2.K0) {
                    tVar2.f31836x0.setAlpha(1.0f);
                    tVar2.K0 = true;
                    oVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                tVar2.f31836x0.setRotationY(f7);
                oVar.d.setRotationY(f7);
                return;
        }
    }
}
