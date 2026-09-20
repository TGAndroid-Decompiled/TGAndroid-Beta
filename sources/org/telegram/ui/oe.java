package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f36283a;
    public final zn f36284b;

    public oe(zn znVar, int i10) {
        this.f36283a = i10;
        this.f36284b = znVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36283a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.f36284b;
                znVar.K8 = floatValue;
                rm rmVar = znVar.X0;
                if (rmVar != null) {
                    rmVar.invalidate();
                    znVar.f40530x0.invalidate();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f36284b;
                znVar2.getClass();
                znVar2.f40345i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.lc();
                return;
            case 2:
                zn znVar3 = this.f36284b;
                znVar3.getClass();
                znVar3.f40345i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.lc();
                return;
            case 3:
                zn znVar4 = this.f36284b;
                znVar4.getClass();
                znVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.o9();
                return;
            default:
                zn znVar5 = this.f36284b;
                znVar5.getClass();
                znVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.o9();
                return;
        }
    }
}
