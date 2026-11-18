package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class vj implements ValueAnimator.AnimatorUpdateListener {
    public final int f40685a;
    public final int f40686b;
    public final float f40687c;
    public final FrameLayout d;

    public vj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f40685a = i10;
        this.d = frameLayout;
        this.f40686b = i7;
        this.f40687c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40685a) {
            case 0:
                kk kkVar = (kk) this.d;
                yj yjVar = kkVar.f36781r;
                yj yjVar2 = kkVar.f36782s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f40686b;
                float f10 = this.f40687c;
                if (i7 == 1) {
                    yjVar.setTranslationX(f10 * floatValue);
                    yjVar.setAlpha(1.0f - floatValue);
                    yjVar.invalidate();
                    yjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    yjVar2.setScaleX(f11);
                    yjVar2.setScaleY(f11);
                    return;
                }
                yjVar2.setTranslationX(f10 * floatValue);
                yjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                yjVar2.invalidate();
                yjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                yjVar.setScaleX(f12);
                yjVar.setScaleY(f12);
                yjVar2.invalidate();
                return;
            default:
                oa0 oa0Var = (oa0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((oa0Var.S * floatValue2) + (this.f40686b * f13));
                oa0Var.U = i10;
                oa0Var.f((oa0Var.T * floatValue2) + (this.f40687c * f13), i10);
                return;
        }
    }
}
