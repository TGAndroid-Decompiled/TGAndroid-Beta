package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.qu0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f28837a;
    public final k f28838b;

    public a(k kVar, int i7) {
        this.f28837a = i7;
        this.f28838b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f28837a) {
            case 0:
                qu0 qu0Var = this.f28838b.f29151f1;
                if (qu0Var != null) {
                    qu0Var.run();
                    return;
                }
                return;
            case 1:
                qu0 qu0Var2 = this.f28838b.f29151f1;
                if (qu0Var2 != null) {
                    qu0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f28838b;
                kVar.f29168p0 = floatValue;
                if (kVar.f29135a != null && kVar.S0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.f29168p0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.f29135a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.Q0 && (yVar = kVar.F) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.f29168p0));
                }
                qu0 qu0Var3 = kVar.f29151f1;
                if (qu0Var3 != null) {
                    qu0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f28838b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.i();
                return;
            default:
                k kVar3 = this.f28838b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.i();
                return;
        }
    }
}
