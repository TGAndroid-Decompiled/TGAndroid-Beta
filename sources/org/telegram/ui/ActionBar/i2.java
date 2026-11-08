package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.si0;
import org.telegram.ui.vp;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27564a;
    public final int f27565b;
    public final Object f27566c;

    public i2(Object obj, int i7, int i10) {
        this.f27564a = i10;
        this.f27566c = obj;
        this.f27565b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f27564a) {
            case 0:
                v2 v2Var = (v2) this.f27566c;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.C0(this.f27565b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f27566c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.f27565b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                lt ltVar = (lt) this.f27566c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ltVar.d.setTranslationY(floatValue2);
                int i10 = this.f27565b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ltVar.R = f11;
                if (i10 > 0 && ((i7 = ltVar.L) == 2 || i7 == 3)) {
                    ltVar.d.setAlpha(f11);
                }
                ltVar.c(floatValue2 - f10);
                return;
            case 3:
                ((hy) this.f27566c).Q0[this.f27565b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                n40 n40Var = (n40) this.f27566c;
                if (this.f27565b == n40Var.f36233t0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    n40Var.f36238x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                vp vpVar = (vp) this.f27566c;
                vpVar.getClass();
                si0 si0Var = (si0) vpVar.d;
                si0Var.f38088b.put(this.f27565b, (Float) valueAnimator.getAnimatedValue());
                si0Var.d = true;
                si0Var.f38087a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f27566c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f58800n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f27565b));
                fVar.f58802p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
