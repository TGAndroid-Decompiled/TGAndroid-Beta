package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.wv0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20136a;
    public final l f20137b;

    public a(l lVar, int i10) {
        this.f20136a = i10;
        this.f20137b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f20136a) {
            case 0:
                wv0 wv0Var = this.f20137b.f20478d1;
                if (wv0Var != null) {
                    wv0Var.run();
                    return;
                }
                return;
            case 1:
                wv0 wv0Var2 = this.f20137b.f20478d1;
                if (wv0Var2 != null) {
                    wv0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f20137b;
                lVar.f20499o0 = floatValue;
                if (lVar.f20468a != null && lVar.R0) {
                    float L = org.telegram.messenger.i0.L(23.0f);
                    float W1 = org.telegram.messenger.i0.W1(lVar.f20499o0, org.telegram.messenger.i0.L(18.33f), org.telegram.messenger.i0.L(23.0f));
                    lVar.f20468a.r(W1, L, L, W1);
                    lVar.invalidate();
                }
                if (lVar.P0 && (yVar = lVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), lVar.f20499o0));
                }
                wv0 wv0Var3 = lVar.f20478d1;
                if (wv0Var3 != null) {
                    wv0Var3.run();
                    return;
                }
                return;
            case 3:
                l lVar2 = this.f20137b;
                lVar2.getClass();
                lVar2.C1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.f();
                return;
            default:
                l lVar3 = this.f20137b;
                lVar3.getClass();
                lVar3.C1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.f();
                return;
        }
    }
}
