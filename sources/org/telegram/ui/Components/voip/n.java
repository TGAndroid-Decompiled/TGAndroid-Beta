package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class n implements ValueAnimator.AnimatorUpdateListener {

    public final int f33723a;

    public final t f33724b;

    public n(t tVar, int i10) {
        this.f33723a = i10;
        this.f33724b = tVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f33723a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.f33724b;
                tVar.T = fFloatValue;
                tVar.U.setAlpha(fFloatValue);
                tVar.f33871a.invalidate();
                break;
            default:
                t tVar2 = this.f33724b;
                o oVar = tVar2.f33871a;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    fFloatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !tVar2.G0) {
                    tVar2.f33897t0.setAlpha(1.0f);
                    tVar2.G0 = true;
                    oVar.d.clearImage();
                }
                float f10 = fFloatValue2 * 180.0f;
                tVar2.f33897t0.setRotationY(f10);
                oVar.d.setRotationY(f10);
                break;
        }
    }
}
