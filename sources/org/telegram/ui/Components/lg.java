package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lg implements ValueAnimator.AnimatorUpdateListener {
    public final int f35718a;
    public final bi f35719b;

    public lg(bi biVar, int i3) {
        this.f35718a = i3;
        this.f35719b = biVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35718a) {
            case 0:
                this.f35719b.Q1();
                return;
            case 1:
                this.f35719b.f32295y2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = this.f35719b;
                biVar.D0 = floatValue;
                org.telegram.ui.ActionBar.j2 j2Var = biVar.f28589c;
                if (j2Var != null) {
                    j2Var.invalidate();
                    return;
                }
                return;
            case 3:
                bi biVar2 = this.f35719b;
                biVar2.getClass();
                biVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                bi biVar3 = this.f35719b;
                th thVar = biVar3.f32275t2;
                hk hkVar = biVar3.f32255o2;
                if (thVar == hkVar && hkVar != null) {
                    hkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f35719b.Q1();
                return;
        }
    }
}
