package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f21743a;
    public final Object f21744b;

    public r(Object obj, int i10) {
        this.f21743a = i10;
        this.f21744b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f21743a) {
            case 0:
                s sVar = (s) this.f21744b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f21744b;
                e0Var.getClass();
                e0Var.f20979w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f20961a.run();
                return;
            case 2:
                s1 s1Var = (s1) this.f21744b;
                s1Var.getClass();
                s1Var.f22262yb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 3:
                f4 f4Var = (f4) this.f21744b;
                org.telegram.ui.Components.p9 p9Var = f4Var.f21019a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f4Var.E) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                p9Var.setScaleX(f10);
                p9Var.setScaleY(f10);
                if (!f4Var.E) {
                    floatValue = 1.0f - floatValue;
                }
                f4Var.F = floatValue;
                f4Var.invalidate();
                return;
            case 4:
                m6 m6Var = (m6) this.f21744b;
                m6Var.getClass();
                m6Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                return;
            case 5:
                q7 q7Var = (q7) this.f21744b;
                q7Var.getClass();
                q7Var.f21707f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.invalidate();
                return;
            case 6:
                w7 w7Var = (w7) this.f21744b;
                w7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - w7Var.v) * (-0.3f));
                }
                w7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                y9 y9Var = (y9) this.f21744b;
                y9Var.getClass();
                y9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.C.invalidate();
                return;
            default:
                ba baVar = (ba) ((aa) this.f21744b).f20822b;
                baVar.f20862a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.f20862a.invalidate();
                return;
        }
    }
}
