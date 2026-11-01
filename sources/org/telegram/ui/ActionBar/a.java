package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.vv0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20137a;
    public final l f20138b;

    public a(l lVar, int i10) {
        this.f20137a = i10;
        this.f20138b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f20137a) {
            case 0:
                vv0 vv0Var = this.f20138b.f20481e1;
                if (vv0Var != null) {
                    vv0Var.run();
                    return;
                }
                return;
            case 1:
                vv0 vv0Var2 = this.f20138b.f20481e1;
                if (vv0Var2 != null) {
                    vv0Var2.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f20138b;
                lVar.f20500o0 = floatValue;
                if (lVar.f20469a != null && lVar.R0) {
                    float L = org.telegram.messenger.i0.L(23.0f);
                    float W1 = org.telegram.messenger.i0.W1(lVar.f20500o0, org.telegram.messenger.i0.L(18.33f), org.telegram.messenger.i0.L(23.0f));
                    lVar.f20469a.r(W1, L, L, W1);
                    lVar.invalidate();
                }
                if (lVar.P0 && (yVar = lVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), lVar.f20500o0));
                }
                vv0 vv0Var3 = lVar.f20481e1;
                if (vv0Var3 != null) {
                    vv0Var3.run();
                    return;
                }
                return;
            case 3:
                l lVar2 = this.f20138b;
                lVar2.getClass();
                lVar2.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.f();
                return;
            default:
                l lVar3 = this.f20138b;
                lVar3.getClass();
                lVar3.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.f();
                return;
        }
    }
}
