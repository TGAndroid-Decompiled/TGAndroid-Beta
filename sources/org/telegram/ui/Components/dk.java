package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class dk implements ValueAnimator.AnimatorUpdateListener {
    public final int f22438a;
    public final int f22439b;
    public final float f22440c;
    public final FrameLayout d;

    public dk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f22438a = i11;
        this.d = frameLayout;
        this.f22439b = i10;
        this.f22440c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22438a) {
            case 0:
                tk tkVar = (tk) this.d;
                ik ikVar = tkVar.f27428r;
                ik ikVar2 = tkVar.f27429s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f22439b;
                float f7 = this.f22440c;
                if (i10 == 1) {
                    ikVar.setTranslationX(f7 * floatValue);
                    ikVar.setAlpha(1.0f - floatValue);
                    ikVar.invalidate();
                    ikVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ikVar2.setScaleX(f10);
                    ikVar2.setScaleY(f10);
                    return;
                }
                ikVar2.setTranslationX(f7 * floatValue);
                ikVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ikVar2.invalidate();
                ikVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                ikVar.setScaleX(f11);
                ikVar.setScaleY(f11);
                ikVar2.invalidate();
                return;
            default:
                yb0 yb0Var = (yb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((yb0Var.R * floatValue2) + (this.f22439b * f12));
                yb0Var.T = i11;
                yb0Var.e((yb0Var.S * floatValue2) + (this.f22440c * f12), i11);
                return;
        }
    }
}
