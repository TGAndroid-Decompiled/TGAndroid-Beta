package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class sj implements ValueAnimator.AnimatorUpdateListener {
    public final int f28753a;
    public final int f28754b;
    public final float f28755c;
    public final FrameLayout d;

    public sj(FrameLayout frameLayout, int i10, float f10, int i11) {
        this.f28753a = i11;
        this.d = frameLayout;
        this.f28754b = i10;
        this.f28755c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28753a) {
            case 0:
                hk hkVar = (hk) this.d;
                vj vjVar = hkVar.f25436r;
                vj vjVar2 = hkVar.f25437s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f28754b;
                float f10 = this.f28755c;
                if (i10 == 1) {
                    vjVar.setTranslationX(f10 * floatValue);
                    vjVar.setAlpha(1.0f - floatValue);
                    vjVar.invalidate();
                    vjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    vjVar2.setScaleX(f11);
                    vjVar2.setScaleY(f11);
                    return;
                }
                vjVar2.setTranslationX(f10 * floatValue);
                vjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                vjVar2.invalidate();
                vjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                vjVar.setScaleX(f12);
                vjVar.setScaleY(f12);
                vjVar2.invalidate();
                return;
            default:
                rb0 rb0Var = (rb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i11 = (int) ((rb0Var.O * floatValue2) + (this.f28754b * f13));
                rb0Var.Q = i11;
                rb0Var.e((rb0Var.P * floatValue2) + (this.f28755c * f13), i11);
                return;
        }
    }
}
