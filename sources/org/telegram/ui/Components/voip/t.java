package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f40952a;
    public final z f40953b;

    public t(z zVar, int i7) {
        this.f40952a = i7;
        this.f40953b = zVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f40952a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z zVar = this.f40953b;
                zVar.f41084b0 = floatValue;
                zVar.f41086c0.setAlpha(floatValue);
                zVar.f41081a.invalidate();
                return;
            default:
                z zVar2 = this.f40953b;
                v vVar = zVar2.f41081a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !zVar2.L0) {
                    zVar2.f41115y0.setAlpha(1.0f);
                    zVar2.L0 = true;
                    vVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                zVar2.f41115y0.setRotationY(f10);
                vVar.d.setRotationY(f10);
                return;
        }
    }
}
