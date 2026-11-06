package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.si0;
import org.telegram.ui.vp;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27560a;
    public final int f27561b;
    public final Object f27562c;

    public i2(Object obj, int i7, int i10) {
        this.f27560a = i10;
        this.f27562c = obj;
        this.f27561b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f27560a) {
            case 0:
                v2 v2Var = (v2) this.f27562c;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.C0(this.f27561b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f27562c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.f27561b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                kt ktVar = (kt) this.f27562c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ktVar.d.setTranslationY(floatValue2);
                int i10 = this.f27561b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ktVar.R = f11;
                if (i10 > 0 && ((i7 = ktVar.L) == 2 || i7 == 3)) {
                    ktVar.d.setAlpha(f11);
                }
                ktVar.c(floatValue2 - f10);
                return;
            case 3:
                ((gy) this.f27562c).Q0[this.f27561b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                n40 n40Var = (n40) this.f27562c;
                if (this.f27561b == n40Var.f36264s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    n40Var.f36270x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                vp vpVar = (vp) this.f27562c;
                vpVar.getClass();
                si0 si0Var = (si0) vpVar.d;
                si0Var.f38108b.put(this.f27561b, (Float) valueAnimator.getAnimatedValue());
                si0Var.d = true;
                si0Var.f38107a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f27562c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f58681n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f27561b));
                fVar.f58683p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
