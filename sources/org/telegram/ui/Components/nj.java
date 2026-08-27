package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class nj implements ValueAnimator.AnimatorUpdateListener {

    public final int f30981a;

    public final int f30982b;

    public final float f30983c;
    public final FrameLayout d;

    public nj(FrameLayout frameLayout, int i10, float f10, int i11) {
        this.f30981a = i11;
        this.d = frameLayout;
        this.f30982b = i10;
        this.f30983c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30981a) {
            case 0:
                bk bkVar = (bk) this.d;
                qj qjVar = bkVar.f27115r;
                qj qjVar2 = bkVar.f27116s;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f30982b;
                float f10 = this.f30983c;
                if (i10 != 1) {
                    qjVar2.setTranslationX(f10 * fFloatValue);
                    qjVar2.setAlpha(Math.max(0.0f, 1.0f - fFloatValue));
                    qjVar2.invalidate();
                    qjVar.setAlpha(fFloatValue);
                    float f11 = (fFloatValue * 0.05f) + 0.95f;
                    qjVar.setScaleX(f11);
                    qjVar.setScaleY(f11);
                    qjVar2.invalidate();
                } else {
                    qjVar.setTranslationX(f10 * fFloatValue);
                    qjVar.setAlpha(1.0f - fFloatValue);
                    qjVar.invalidate();
                    qjVar2.setAlpha(fFloatValue);
                    float f12 = (fFloatValue * 0.05f) + 0.95f;
                    qjVar2.setScaleX(f12);
                    qjVar2.setScaleY(f12);
                }
                break;
            default:
                ab0 ab0Var = (ab0) this.d;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - fFloatValue2;
                int i11 = (int) ((ab0Var.N * fFloatValue2) + (this.f30982b * f13));
                ab0Var.P = i11;
                ab0Var.e((ab0Var.O * fFloatValue2) + (this.f30983c * f13), i11);
                break;
        }
    }
}
