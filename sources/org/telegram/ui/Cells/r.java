package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f20863a;
    public final Object f20864b;

    public r(Object obj, int i10) {
        this.f20863a = i10;
        this.f20864b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f20863a) {
            case 0:
                s sVar = (s) this.f20864b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f20864b;
                e0Var.getClass();
                e0Var.f20173w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f20155a.run();
                return;
            case 2:
                u1 u1Var = (u1) this.f20864b;
                u1Var.getClass();
                u1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                return;
            case 3:
                h4 h4Var = (h4) this.f20864b;
                org.telegram.ui.Components.v9 v9Var = h4Var.f20378a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                v9Var.setScaleX(f7);
                v9Var.setScaleY(f7);
                if (!h4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.I = floatValue;
                h4Var.invalidate();
                return;
            case 4:
                p6 p6Var = (p6) this.f20864b;
                p6Var.getClass();
                p6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.invalidate();
                return;
            case 5:
                u7 u7Var = (u7) this.f20864b;
                u7Var.getClass();
                u7Var.f21631i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                return;
            case 6:
                a8 a8Var = (a8) this.f20864b;
                a8Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                ea eaVar = (ea) this.f20864b;
                eaVar.getClass();
                eaVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.C.invalidate();
                return;
            default:
                ha haVar = (ha) ((ga) this.f20864b).f20353b;
                haVar.f20415a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.f20415a.invalidate();
                return;
        }
    }
}
