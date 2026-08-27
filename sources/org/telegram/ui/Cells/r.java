package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;

public final class r implements ValueAnimator.AnimatorUpdateListener {

    public final int f25087a;

    public final Object f25088b;

    public r(Object obj, int i10) {
        this.f25087a = i10;
        this.f25088b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25087a) {
            case 0:
                s sVar = (s) this.f25088b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                e0 e0Var = (e0) this.f25088b;
                e0Var.getClass();
                e0Var.f24250w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f24231a.run();
                break;
            case 2:
                s1 s1Var = (s1) this.f25088b;
                s1Var.getClass();
                s1Var.f25592xb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 3:
                d4 d4Var = (d4) this.f25088b;
                org.telegram.ui.Components.n9 n9Var = d4Var.f24204a;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = d4Var.D ? 1.0f - (0.18f * fFloatValue) : 0.82f + (0.18f * fFloatValue);
                n9Var.setScaleX(f10);
                n9Var.setScaleY(f10);
                if (!d4Var.D) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                d4Var.E = fFloatValue;
                d4Var.invalidate();
                break;
            case 4:
                k6 k6Var = (k6) this.f25088b;
                k6Var.getClass();
                k6Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.invalidate();
                break;
            case 5:
                o7 o7Var = (o7) this.f25088b;
                o7Var.getClass();
                o7Var.f24790e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                break;
            case 6:
                u7 u7Var = (u7) this.f25088b;
                u7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.v = fFloatValue2;
                colorMatrix.setSaturation(fFloatValue2);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - u7Var.v) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                w9 w9Var = (w9) this.f25088b;
                w9Var.getClass();
                w9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.C.invalidate();
                break;
            default:
                z9 z9Var = (z9) ((y9) this.f25088b).f26013b;
                z9Var.f26051a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.f26051a.invalidate();
                break;
        }
    }
}
