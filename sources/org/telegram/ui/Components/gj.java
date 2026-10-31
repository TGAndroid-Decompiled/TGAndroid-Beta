package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gj implements ValueAnimator.AnimatorUpdateListener {
    public final int f26381a;
    public final int f26382b;
    public final float f26383c;
    public final FrameLayout d;

    public gj(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f26381a = i11;
        this.d = frameLayout;
        this.f26382b = i10;
        this.f26383c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26381a) {
            case 0:
                xj xjVar = (xj) this.d;
                lj ljVar = xjVar.f32487r;
                lj ljVar2 = xjVar.f32488s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f26382b;
                float f7 = this.f26383c;
                if (i10 == 1) {
                    ljVar.setTranslationX(f7 * floatValue);
                    ljVar.setAlpha(1.0f - floatValue);
                    ljVar.invalidate();
                    ljVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ljVar2.setScaleX(f10);
                    ljVar2.setScaleY(f10);
                    return;
                }
                ljVar2.setTranslationX(f7 * floatValue);
                ljVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ljVar2.invalidate();
                ljVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                ljVar.setScaleX(f11);
                ljVar.setScaleY(f11);
                ljVar2.invalidate();
                return;
            default:
                ua0 ua0Var = (ua0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((ua0Var.R * floatValue2) + (this.f26382b * f12));
                ua0Var.T = i11;
                ua0Var.f((ua0Var.S * floatValue2) + (this.f26383c * f12), i11);
                return;
        }
    }
}
