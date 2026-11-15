package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.xp;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28632a;
    public final int f28633b;
    public final Object f28634c;

    public h2(Object obj, int i7, int i10) {
        this.f28632a = i10;
        this.f28634c = obj;
        this.f28633b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f28632a) {
            case 0:
                u2 u2Var = (u2) this.f28634c;
                u2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var.C0(this.f28633b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28634c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == this.f28633b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                rt rtVar = (rt) this.f28634c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rtVar.d.setTranslationY(floatValue2);
                int i10 = this.f28633b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                rtVar.S = f11;
                if (i10 > 0 && ((i7 = rtVar.M) == 2 || i7 == 3)) {
                    rtVar.d.setAlpha(f11);
                }
                rtVar.c(floatValue2 - f10);
                return;
            case 3:
                ((ly) this.f28634c).R0[this.f28633b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                q40 q40Var = (q40) this.f28634c;
                if (this.f28633b == q40Var.f38510u0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    q40Var.f38514x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                xp xpVar = (xp) this.f28634c;
                xpVar.getClass();
                xi0 xi0Var = (xi0) xpVar.d;
                xi0Var.f41698b.put(this.f28633b, (Float) valueAnimator.getAnimatedValue());
                xi0Var.d = true;
                xi0Var.f41697a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f28634c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f59992n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f28633b));
                fVar.f59994p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
