package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.tp;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27517a;
    public final int f27518b;
    public final Object f27519c;

    public g2(Object obj, int i3, int i10) {
        this.f27517a = i10;
        this.f27519c = obj;
        this.f27518b = i3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3;
        switch (this.f27517a) {
            case 0:
                t2 t2Var = (t2) this.f27519c;
                t2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                t2Var.C0(this.f27518b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f27519c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.f27518b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                jt jtVar = (jt) this.f27519c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jtVar.d.setTranslationY(floatValue2);
                int i10 = this.f27518b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                jtVar.S = f11;
                if (i10 > 0 && ((i3 = jtVar.M) == 2 || i3 == 3)) {
                    jtVar.d.setAlpha(f11);
                }
                jtVar.c(floatValue2 - f10);
                return;
            case 3:
                ((ey) this.f27519c).R0[this.f27518b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                j40 j40Var = (j40) this.f27519c;
                if (this.f27518b == j40Var.f34951t0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    j40Var.f34956x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                tp tpVar = (tp) this.f27519c;
                tpVar.getClass();
                wi0 wi0Var = (wi0) tpVar.d;
                wi0Var.f40014b.put(this.f27518b, (Float) valueAnimator.getAnimatedValue());
                wi0Var.d = true;
                wi0Var.f40013a.invalidate();
                return;
            default:
                yh.f fVar = (yh.f) this.f27519c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f59518n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f27518b));
                fVar.f59520p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
