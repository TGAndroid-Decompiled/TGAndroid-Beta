package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.si0;
import org.telegram.ui.vp;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27561a;
    public final int f27562b;
    public final Object f27563c;

    public i2(Object obj, int i7, int i10) {
        this.f27561a = i10;
        this.f27563c = obj;
        this.f27562b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f27561a) {
            case 0:
                v2 v2Var = (v2) this.f27563c;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.C0(this.f27562b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f27563c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.f27562b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                kt ktVar = (kt) this.f27563c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ktVar.d.setTranslationY(floatValue2);
                int i10 = this.f27562b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ktVar.R = f11;
                if (i10 > 0 && ((i7 = ktVar.L) == 2 || i7 == 3)) {
                    ktVar.d.setAlpha(f11);
                }
                ktVar.c(floatValue2 - f10);
                return;
            case 3:
                ((gy) this.f27563c).Q0[this.f27562b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                n40 n40Var = (n40) this.f27563c;
                if (this.f27562b == n40Var.f36217t0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    n40Var.f36222x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                vp vpVar = (vp) this.f27563c;
                vpVar.getClass();
                si0 si0Var = (si0) vpVar.d;
                si0Var.f38072b.put(this.f27562b, (Float) valueAnimator.getAnimatedValue());
                si0Var.d = true;
                si0Var.f38071a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f27563c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f58711n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f27562b));
                fVar.f58713p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
