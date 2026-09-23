package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f20607a;
    public final Object f20608b;

    public r(Object obj, int i10) {
        this.f20607a = i10;
        this.f20608b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f20607a) {
            case 0:
                s sVar = (s) this.f20608b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f20608b;
                e0Var.getClass();
                e0Var.f19920w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f19902a.run();
                return;
            case 2:
                t1 t1Var = (t1) this.f20608b;
                t1Var.getClass();
                t1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 3:
                g4 g4Var = (g4) this.f20608b;
                org.telegram.ui.Components.w9 w9Var = g4Var.f20086a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (g4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                w9Var.setScaleX(f7);
                w9Var.setScaleY(f7);
                if (!g4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.I = floatValue;
                g4Var.invalidate();
                return;
            case 4:
                o6 o6Var = (o6) this.f20608b;
                o6Var.getClass();
                o6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                return;
            case 5:
                t7 t7Var = (t7) this.f20608b;
                t7Var.getClass();
                t7Var.f21356i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 6:
                a8 a8Var = (a8) this.f20608b;
                a8Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                ea eaVar = (ea) this.f20608b;
                eaVar.getClass();
                eaVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.C.invalidate();
                return;
            default:
                ha haVar = (ha) ((ga) this.f20608b).f20122b;
                haVar.f20169a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.f20169a.invalidate();
                return;
        }
    }
}
