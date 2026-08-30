package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f21594a;
    public final Object f21595b;

    public r(Object obj, int i10) {
        this.f21594a = i10;
        this.f21595b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f21594a) {
            case 0:
                s sVar = (s) this.f21595b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f21595b;
                e0Var.getClass();
                e0Var.f20980w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f20962a.run();
                return;
            case 2:
                t1 t1Var = (t1) this.f21595b;
                t1Var.getClass();
                t1Var.f22325yb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 3:
                g4 g4Var = (g4) this.f21595b;
                org.telegram.ui.Components.p9 p9Var = g4Var.f21088a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (g4Var.E) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                p9Var.setScaleX(f10);
                p9Var.setScaleY(f10);
                if (!g4Var.E) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.F = floatValue;
                g4Var.invalidate();
                return;
            case 4:
                n6 n6Var = (n6) this.f21595b;
                n6Var.getClass();
                n6Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 5:
                r7 r7Var = (r7) this.f21595b;
                r7Var.getClass();
                r7Var.f21774f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                return;
            case 6:
                x7 x7Var = (x7) this.f21595b;
                x7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                z9 z9Var = (z9) this.f21595b;
                z9Var.getClass();
                z9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.C.invalidate();
                return;
            default:
                ca caVar = (ca) ((ba) this.f21595b).f20891b;
                caVar.f20933a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.f20933a.invalidate();
                return;
        }
    }
}
