package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sz;
import org.telegram.ui.tq;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23125a;
    public final int f23126b;
    public final Object f23127c;

    public u2(Object obj, int i10, int i11) {
        this.f23125a = i11;
        this.f23127c = obj;
        this.f23126b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f23125a) {
            case 0:
                k3 k3Var = (k3) this.f23127c;
                k3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var.setItemColor(this.f23126b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f23127c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == this.f23126b) {
                    s1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ru ruVar = (ru) this.f23127c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.d.setTranslationY(floatValue2);
                int i11 = this.f23126b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                ruVar.R = f10;
                if (i11 > 0 && ((i10 = ruVar.L) == 2 || i10 == 3)) {
                    ruVar.d.setAlpha(f10);
                }
                ruVar.c(floatValue2 - f7);
                return;
            case 3:
                ((sz) this.f23127c).Q0[this.f23126b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                o60 o60Var = (o60) this.f23127c;
                if (this.f23126b == o60Var.f31193s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    o60Var.f31197w.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                tq tqVar = (tq) this.f23127c;
                tqVar.getClass();
                rl0 rl0Var = (rl0) tqVar.d;
                rl0Var.f32275b.put(this.f23126b, (Float) valueAnimator.getAnimatedValue());
                rl0Var.d = true;
                rl0Var.f32274a.invalidate();
                return;
            default:
                xh.g gVar = (xh.g) this.f23127c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f51928n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f23126b));
                gVar.f51930p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
