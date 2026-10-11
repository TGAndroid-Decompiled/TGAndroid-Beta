package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f40223a;
    public final zn f40224b;

    public ne(zn znVar, int i10) {
        this.f40223a = i10;
        this.f40224b = znVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40223a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.f40224b;
                znVar.K8 = floatValue;
                sm smVar = znVar.X0;
                if (smVar != null) {
                    smVar.invalidate();
                    znVar.f44989x0.invalidate();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f40224b;
                znVar2.getClass();
                znVar2.f44803i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.pc();
                return;
            case 2:
                zn znVar3 = this.f40224b;
                znVar3.getClass();
                znVar3.f44803i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.pc();
                return;
            case 3:
                zn znVar4 = this.f40224b;
                znVar4.getClass();
                znVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.t9();
                return;
            default:
                zn znVar5 = this.f40224b;
                znVar5.getClass();
                znVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.t9();
                return;
        }
    }
}
