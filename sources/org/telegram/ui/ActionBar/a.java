package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.uu0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f27302a;
    public final l f27303b;

    public a(l lVar, int i7) {
        this.f27302a = i7;
        this.f27303b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f27302a) {
            case 0:
                uu0 uu0Var = this.f27303b.f27674e1;
                if (uu0Var != null) {
                    uu0Var.run();
                    return;
                }
                return;
            case 1:
                uu0 uu0Var2 = this.f27303b.f27674e1;
                if (uu0Var2 != null) {
                    uu0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f27303b;
                lVar.f27692o0 = floatValue;
                if (lVar.f27661a != null && lVar.R0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(lVar.f27692o0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    lVar.f27661a.s(W1, L, L, W1);
                    lVar.invalidate();
                }
                if (lVar.P0 && (yVar = lVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), lVar.f27692o0));
                }
                uu0 uu0Var3 = lVar.f27674e1;
                if (uu0Var3 != null) {
                    uu0Var3.run();
                    return;
                }
                return;
            case 3:
                l lVar2 = this.f27303b;
                lVar2.getClass();
                lVar2.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.h();
                return;
            default:
                l lVar3 = this.f27303b;
                lVar3.getClass();
                lVar3.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.h();
                return;
        }
    }
}
