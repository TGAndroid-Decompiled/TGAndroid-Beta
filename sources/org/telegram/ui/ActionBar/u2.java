package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sz;
import org.telegram.ui.rq;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23124a;
    public final int f23125b;
    public final Object f23126c;

    public u2(Object obj, int i10, int i11) {
        this.f23124a = i11;
        this.f23126c = obj;
        this.f23125b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f23124a) {
            case 0:
                k3 k3Var = (k3) this.f23126c;
                k3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var.setItemColor(this.f23125b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f23126c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == this.f23125b) {
                    s1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ru ruVar = (ru) this.f23126c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.d.setTranslationY(floatValue2);
                int i11 = this.f23125b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                ruVar.R = f10;
                if (i11 > 0 && ((i10 = ruVar.L) == 2 || i10 == 3)) {
                    ruVar.d.setAlpha(f10);
                }
                ruVar.c(floatValue2 - f7);
                return;
            case 3:
                ((sz) this.f23126c).Q0[this.f23125b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                n60 n60Var = (n60) this.f23126c;
                if (this.f23125b == n60Var.f30870s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    n60Var.f30876x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                rq rqVar = (rq) this.f23126c;
                rqVar.getClass();
                ql0 ql0Var = (ql0) rqVar.d;
                ql0Var.f31953b.put(this.f23125b, (Float) valueAnimator.getAnimatedValue());
                ql0Var.d = true;
                ql0Var.f31952a.invalidate();
                return;
            default:
                xh.g gVar = (xh.g) this.f23126c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f51870n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f23125b));
                gVar.f51872p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
