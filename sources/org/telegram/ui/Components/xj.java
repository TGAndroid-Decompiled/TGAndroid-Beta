package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class xj implements ValueAnimator.AnimatorUpdateListener {
    public final int f42148a;
    public final int f42149b;
    public final float f42150c;
    public final FrameLayout d;

    public xj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f42148a = i10;
        this.d = frameLayout;
        this.f42149b = i7;
        this.f42150c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42148a) {
            case 0:
                mk mkVar = (mk) this.d;
                ak akVar = mkVar.f37534r;
                ak akVar2 = mkVar.f37535s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f42149b;
                float f10 = this.f42150c;
                if (i7 == 1) {
                    akVar.setTranslationX(f10 * floatValue);
                    akVar.setAlpha(1.0f - floatValue);
                    akVar.invalidate();
                    akVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    akVar2.setScaleX(f11);
                    akVar2.setScaleY(f11);
                    return;
                }
                akVar2.setTranslationX(f10 * floatValue);
                akVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                akVar2.invalidate();
                akVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                akVar.setScaleX(f12);
                akVar.setScaleY(f12);
                akVar2.invalidate();
                return;
            default:
                qa0 qa0Var = (qa0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((qa0Var.S * floatValue2) + (this.f42149b * f13));
                qa0Var.U = i10;
                qa0Var.f((qa0Var.T * floatValue2) + (this.f42150c * f13), i10);
                return;
        }
    }
}
