package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class zj implements ValueAnimator.AnimatorUpdateListener {
    public final int f35366a;
    public final int f35367b;
    public final float f35368c;
    public final FrameLayout d;

    public zj(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f35366a = i11;
        this.d = frameLayout;
        this.f35367b = i10;
        this.f35368c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35366a) {
            case 0:
                nk nkVar = (nk) this.d;
                ck ckVar = nkVar.f30947r;
                ck ckVar2 = nkVar.f30948s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f35367b;
                float f7 = this.f35368c;
                if (i10 == 1) {
                    ckVar.setTranslationX(f7 * floatValue);
                    ckVar.setAlpha(1.0f - floatValue);
                    ckVar.invalidate();
                    ckVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ckVar2.setScaleX(f10);
                    ckVar2.setScaleY(f10);
                    return;
                }
                ckVar2.setTranslationX(f7 * floatValue);
                ckVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ckVar2.invalidate();
                ckVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                ckVar.setScaleX(f11);
                ckVar.setScaleY(f11);
                ckVar2.invalidate();
                return;
            default:
                ic0 ic0Var = (ic0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((ic0Var.R * floatValue2) + (this.f35367b * f12));
                ic0Var.T = i11;
                ic0Var.f((ic0Var.S * floatValue2) + (this.f35368c * f12), i11);
                return;
        }
    }
}
