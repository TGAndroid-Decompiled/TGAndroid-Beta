package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f24927a;
    public final Object f24928b;

    public r(Object obj, int i9) {
        this.f24927a = i9;
        this.f24928b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f24927a) {
            case 0:
                s sVar = (s) this.f24928b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f24928b;
                e0Var.getClass();
                e0Var.f24268w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f24249a.run();
                return;
            case 2:
                t1 t1Var = (t1) this.f24928b;
                t1Var.getClass();
                t1Var.f25639xb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 3:
                g4 g4Var = (g4) this.f24928b;
                org.telegram.ui.Components.o9 o9Var = g4Var.f24381a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (g4Var.D) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                o9Var.setScaleX(f10);
                o9Var.setScaleY(f10);
                if (!g4Var.D) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.E = floatValue;
                g4Var.invalidate();
                return;
            case 4:
                n6 n6Var = (n6) this.f24928b;
                n6Var.getClass();
                n6Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 5:
                r7 r7Var = (r7) this.f24928b;
                r7Var.getClass();
                r7Var.f25098e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                return;
            case 6:
                x7 x7Var = (x7) this.f24928b;
                x7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                aa aaVar = (aa) this.f24928b;
                aaVar.getClass();
                aaVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.C.invalidate();
                return;
            default:
                da daVar = (da) ((ca) this.f24928b).f24211b;
                daVar.f24247a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.f24247a.invalidate();
                return;
        }
    }
}
