package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f22798a;
    public final Object f22799b;

    public r(Object obj, int i10) {
        this.f22798a = i10;
        this.f22799b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f22798a) {
            case 0:
                s sVar = (s) this.f22799b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f22799b;
                e0Var.getClass();
                e0Var.f22174w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f22156a.run();
                return;
            case 2:
                u1 u1Var = (u1) this.f22799b;
                u1Var.getClass();
                u1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                return;
            case 3:
                f4 f4Var = (f4) this.f22799b;
                org.telegram.ui.Components.w9 w9Var = f4Var.f22236a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                w9Var.setScaleX(f7);
                w9Var.setScaleY(f7);
                if (!f4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                f4Var.I = floatValue;
                f4Var.invalidate();
                return;
            case 4:
                n6 n6Var = (n6) this.f22799b;
                n6Var.getClass();
                n6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 5:
                s7 s7Var = (s7) this.f22799b;
                s7Var.getClass();
                s7Var.f23035i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                return;
            case 6:
                y7 y7Var = (y7) this.f22799b;
                y7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                aa aaVar = (aa) this.f22799b;
                aaVar.getClass();
                aaVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.C.invalidate();
                return;
            default:
                da daVar = (da) ((ca) this.f22799b).f22112b;
                daVar.f22154a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.f22154a.invalidate();
                return;
        }
    }
}
