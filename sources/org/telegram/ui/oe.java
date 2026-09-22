package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f36301a;
    public final zn f36302b;

    public oe(zn znVar, int i10) {
        this.f36301a = i10;
        this.f36302b = znVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36301a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.f36302b;
                znVar.K8 = floatValue;
                rm rmVar = znVar.X0;
                if (rmVar != null) {
                    rmVar.invalidate();
                    znVar.f40551x0.invalidate();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f36302b;
                znVar2.getClass();
                znVar2.f40366i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.lc();
                return;
            case 2:
                zn znVar3 = this.f36302b;
                znVar3.getClass();
                znVar3.f40366i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.lc();
                return;
            case 3:
                zn znVar4 = this.f36302b;
                znVar4.getClass();
                znVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.o9();
                return;
            default:
                zn znVar5 = this.f36302b;
                znVar5.getClass();
                znVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.o9();
                return;
        }
    }
}
