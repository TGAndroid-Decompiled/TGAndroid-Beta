package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qe implements ValueAnimator.AnimatorUpdateListener {
    public final int f36034a;
    public final eo f36035b;

    public qe(eo eoVar, int i10) {
        this.f36034a = i10;
        this.f36035b = eoVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36034a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eo eoVar = this.f36035b;
                eoVar.K8 = floatValue;
                vm vmVar = eoVar.X0;
                if (vmVar != null) {
                    vmVar.invalidate();
                    eoVar.f32542x0.invalidate();
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f36035b;
                eoVar2.getClass();
                eoVar2.f32357i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.lc();
                return;
            case 2:
                eo eoVar3 = this.f36035b;
                eoVar3.getClass();
                eoVar3.f32357i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar3.lc();
                return;
            case 3:
                eo eoVar4 = this.f36035b;
                eoVar4.getClass();
                eoVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar4.o9();
                return;
            default:
                eo eoVar5 = this.f36035b;
                eoVar5.getClass();
                eoVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar5.o9();
                return;
        }
    }
}
