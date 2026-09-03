package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pe implements ValueAnimator.AnimatorUpdateListener {
    public final int f37108a;
    public final zn f37109b;

    public pe(zn znVar, int i10) {
        this.f37108a = i10;
        this.f37109b = znVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37108a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.f37109b;
                znVar.H8 = floatValue;
                rm rmVar = znVar.U0;
                if (rmVar != null) {
                    rmVar.invalidate();
                    znVar.f40759u0.invalidate();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f37109b;
                znVar2.getClass();
                znVar2.f40579f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.lc();
                return;
            case 2:
                zn znVar3 = this.f37109b;
                znVar3.getClass();
                znVar3.f40579f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.lc();
                return;
            case 3:
                zn znVar4 = this.f37109b;
                znVar4.getClass();
                znVar4.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.o9();
                return;
            default:
                zn znVar5 = this.f37109b;
                znVar5.getClass();
                znVar5.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.o9();
                return;
        }
    }
}
