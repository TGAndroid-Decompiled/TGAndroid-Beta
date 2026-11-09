package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.xp;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27539a;
    public final int f27540b;
    public final Object f27541c;

    public i2(Object obj, int i7, int i10) {
        this.f27539a = i10;
        this.f27541c = obj;
        this.f27540b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f27539a) {
            case 0:
                v2 v2Var = (v2) this.f27541c;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.C0(this.f27540b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f27541c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == this.f27540b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                lt ltVar = (lt) this.f27541c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ltVar.d.setTranslationY(floatValue2);
                int i10 = this.f27540b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ltVar.R = f11;
                if (i10 > 0 && ((i7 = ltVar.L) == 2 || i7 == 3)) {
                    ltVar.d.setAlpha(f11);
                }
                ltVar.c(floatValue2 - f10);
                return;
            case 3:
                ((hy) this.f27541c).Q0[this.f27540b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                o40 o40Var = (o40) this.f27541c;
                if (this.f27540b == o40Var.f36639t0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    o40Var.f36644x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                xp xpVar = (xp) this.f27541c;
                xpVar.getClass();
                ti0 ti0Var = (ti0) xpVar.d;
                ti0Var.f38431b.put(this.f27540b, (Float) valueAnimator.getAnimatedValue());
                ti0Var.d = true;
                ti0Var.f38430a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f27541c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f58810n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f27540b));
                fVar.f58812p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
