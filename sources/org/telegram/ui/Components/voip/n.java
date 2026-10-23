package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f31765a;
    public final t f31766b;

    public n(t tVar, int i10) {
        this.f31765a = i10;
        this.f31766b = tVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f31765a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.f31766b;
                tVar.f31894a0 = floatValue;
                tVar.f31896b0.setAlpha(floatValue);
                tVar.f31893a.invalidate();
                return;
            default:
                t tVar2 = this.f31766b;
                o oVar = tVar2.f31893a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !tVar2.K0) {
                    tVar2.f31924x0.setAlpha(1.0f);
                    tVar2.K0 = true;
                    oVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                tVar2.f31924x0.setRotationY(f7);
                oVar.d.setRotationY(f7);
                return;
        }
    }
}
