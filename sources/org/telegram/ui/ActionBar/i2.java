package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.si0;
import org.telegram.ui.xp;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27547a;
    public final int f27548b;
    public final Object f27549c;

    public i2(Object obj, int i7, int i10) {
        this.f27547a = i10;
        this.f27549c = obj;
        this.f27548b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f27547a) {
            case 0:
                w2 w2Var = (w2) this.f27549c;
                w2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2Var.C0(this.f27548b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f27549c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == this.f27548b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                kt ktVar = (kt) this.f27549c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ktVar.d.setTranslationY(floatValue2);
                int i10 = this.f27548b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ktVar.R = f11;
                if (i10 > 0 && ((i7 = ktVar.L) == 2 || i7 == 3)) {
                    ktVar.d.setAlpha(f11);
                }
                ktVar.c(floatValue2 - f10);
                return;
            case 3:
                ((gy) this.f27549c).Q0[this.f27548b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                n40 n40Var = (n40) this.f27549c;
                if (this.f27548b == n40Var.f36231t0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    n40Var.f36236x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                xp xpVar = (xp) this.f27549c;
                xpVar.getClass();
                si0 si0Var = (si0) xpVar.d;
                si0Var.f38005b.put(this.f27548b, (Float) valueAnimator.getAnimatedValue());
                si0Var.d = true;
                si0Var.f38004a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f27549c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f58808n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f27548b));
                fVar.f58810p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
