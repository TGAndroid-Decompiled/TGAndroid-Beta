package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ek implements ValueAnimator.AnimatorUpdateListener {
    public final int f26099a;
    public final int f26100b;
    public final float f26101c;
    public final FrameLayout d;

    public ek(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f26099a = i11;
        this.d = frameLayout;
        this.f26100b = i10;
        this.f26101c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26099a) {
            case 0:
                sk skVar = (sk) this.d;
                hk hkVar = skVar.f30837r;
                hk hkVar2 = skVar.f30838s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f26100b;
                float f7 = this.f26101c;
                if (i10 == 1) {
                    hkVar.setTranslationX(f7 * floatValue);
                    hkVar.setAlpha(1.0f - floatValue);
                    hkVar.invalidate();
                    hkVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    hkVar2.setScaleX(f10);
                    hkVar2.setScaleY(f10);
                    return;
                }
                hkVar2.setTranslationX(f7 * floatValue);
                hkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                hkVar2.invalidate();
                hkVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                hkVar.setScaleX(f11);
                hkVar.setScaleY(f11);
                hkVar2.invalidate();
                return;
            default:
                pc0 pc0Var = (pc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((pc0Var.R * floatValue2) + (this.f26100b * f12));
                pc0Var.T = i11;
                pc0Var.e((pc0Var.S * floatValue2) + (this.f26101c * f12), i11);
                return;
        }
    }
}
