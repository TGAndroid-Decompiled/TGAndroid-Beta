package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class uj implements ValueAnimator.AnimatorUpdateListener {
    public final int f31682a;
    public final int f31683b;
    public final float f31684c;
    public final FrameLayout d;

    public uj(FrameLayout frameLayout, int i10, float f10, int i11) {
        this.f31682a = i11;
        this.d = frameLayout;
        this.f31683b = i10;
        this.f31684c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31682a) {
            case 0:
                jk jkVar = (jk) this.d;
                xj xjVar = jkVar.f28143r;
                xj xjVar2 = jkVar.f28144s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f31683b;
                float f10 = this.f31684c;
                if (i10 == 1) {
                    xjVar.setTranslationX(f10 * floatValue);
                    xjVar.setAlpha(1.0f - floatValue);
                    xjVar.invalidate();
                    xjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    xjVar2.setScaleX(f11);
                    xjVar2.setScaleY(f11);
                    return;
                }
                xjVar2.setTranslationX(f10 * floatValue);
                xjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                xjVar2.invalidate();
                xjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                xjVar.setScaleX(f12);
                xjVar.setScaleY(f12);
                xjVar2.invalidate();
                return;
            default:
                sb0 sb0Var = (sb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i11 = (int) ((sb0Var.O * floatValue2) + (this.f31683b * f13));
                sb0Var.Q = i11;
                sb0Var.e((sb0Var.P * floatValue2) + (this.f31684c * f13), i11);
                return;
        }
    }
}
