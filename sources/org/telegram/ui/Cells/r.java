package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f23057a;
    public final Object f23058b;

    public r(Object obj, int i10) {
        this.f23057a = i10;
        this.f23058b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f23057a) {
            case 0:
                s sVar = (s) this.f23058b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                d0 d0Var = (d0) this.f23058b;
                d0Var.getClass();
                d0Var.f22252w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f22234a.run();
                return;
            case 2:
                t1 t1Var = (t1) this.f23058b;
                t1Var.getClass();
                t1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 3:
                f4 f4Var = (f4) this.f23058b;
                org.telegram.ui.Components.u9 u9Var = f4Var.f22358a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                u9Var.setScaleX(f7);
                u9Var.setScaleY(f7);
                if (!f4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                f4Var.I = floatValue;
                f4Var.invalidate();
                return;
            case 4:
                o6 o6Var = (o6) this.f23058b;
                o6Var.getClass();
                o6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                return;
            case 5:
                s7 s7Var = (s7) this.f23058b;
                s7Var.getClass();
                s7Var.f23272i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                return;
            case 6:
                y7 y7Var = (y7) this.f23058b;
                y7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                ba baVar = (ba) this.f23058b;
                baVar.getClass();
                baVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.C.invalidate();
                return;
            default:
                ea eaVar = (ea) ((da) this.f23058b).f22295b;
                eaVar.f22346a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.f22346a.invalidate();
                return;
        }
    }
}
