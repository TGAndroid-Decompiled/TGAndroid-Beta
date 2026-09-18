package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f36178a;
    public final zn f36179b;

    public oe(zn znVar, int i10) {
        this.f36178a = i10;
        this.f36179b = znVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36178a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.f36179b;
                znVar.K8 = floatValue;
                rm rmVar = znVar.X0;
                if (rmVar != null) {
                    rmVar.invalidate();
                    znVar.f40488x0.invalidate();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f36179b;
                znVar2.getClass();
                znVar2.f40303i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.lc();
                return;
            case 2:
                zn znVar3 = this.f36179b;
                znVar3.getClass();
                znVar3.f40303i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.lc();
                return;
            case 3:
                zn znVar4 = this.f36179b;
                znVar4.getClass();
                znVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.o9();
                return;
            default:
                zn znVar5 = this.f36179b;
                znVar5.getClass();
                znVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.o9();
                return;
        }
    }
}
