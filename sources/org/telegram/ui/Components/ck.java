package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ck implements ValueAnimator.AnimatorUpdateListener {
    public final int f23326a;
    public final int f23327b;
    public final float f23328c;
    public final FrameLayout d;

    public ck(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f23326a = i11;
        this.d = frameLayout;
        this.f23327b = i10;
        this.f23328c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23326a) {
            case 0:
                qk qkVar = (qk) this.d;
                fk fkVar = qkVar.f27749r;
                fk fkVar2 = qkVar.f27750s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f23327b;
                float f7 = this.f23328c;
                if (i10 == 1) {
                    fkVar.setTranslationX(f7 * floatValue);
                    fkVar.setAlpha(1.0f - floatValue);
                    fkVar.invalidate();
                    fkVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    fkVar2.setScaleX(f10);
                    fkVar2.setScaleY(f10);
                    return;
                }
                fkVar2.setTranslationX(f7 * floatValue);
                fkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                fkVar2.invalidate();
                fkVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                fkVar.setScaleX(f11);
                fkVar.setScaleY(f11);
                fkVar2.invalidate();
                return;
            default:
                bc0 bc0Var = (bc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((bc0Var.R * floatValue2) + (this.f23327b * f12));
                bc0Var.T = i11;
                bc0Var.e((bc0Var.S * floatValue2) + (this.f23328c * f12), i11);
                return;
        }
    }
}
