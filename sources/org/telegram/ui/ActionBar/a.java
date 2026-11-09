package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.tu0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f27298a;
    public final k f27299b;

    public a(k kVar, int i7) {
        this.f27298a = i7;
        this.f27299b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f27298a) {
            case 0:
                tu0 tu0Var = this.f27299b.f27647e1;
                if (tu0Var != null) {
                    tu0Var.run();
                    return;
                }
                return;
            case 1:
                tu0 tu0Var2 = this.f27299b.f27647e1;
                if (tu0Var2 != null) {
                    tu0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f27299b;
                kVar.f27665o0 = floatValue;
                if (kVar.f27634a != null && kVar.R0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f27665o0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f27634a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.P0 && (yVar = kVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f27665o0));
                }
                tu0 tu0Var3 = kVar.f27647e1;
                if (tu0Var3 != null) {
                    tu0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f27299b;
                kVar2.getClass();
                kVar2.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.g();
                return;
            default:
                k kVar3 = this.f27299b;
                kVar3.getClass();
                kVar3.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.g();
                return;
        }
    }
}
