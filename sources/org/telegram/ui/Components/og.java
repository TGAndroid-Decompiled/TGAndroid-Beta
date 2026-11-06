package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class og implements ValueAnimator.AnimatorUpdateListener {
    public final int f36592a;
    public final di f36593b;

    public og(di diVar, int i7) {
        this.f36592a = i7;
        this.f36593b = diVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36592a) {
            case 0:
                this.f36593b.Q1();
                return;
            case 1:
                this.f36593b.f32975x2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di diVar = this.f36593b;
                diVar.C0 = floatValue;
                org.telegram.ui.ActionBar.l2 l2Var = diVar.f28618c;
                if (l2Var != null) {
                    l2Var.invalidate();
                    return;
                }
                return;
            case 3:
                di diVar2 = this.f36593b;
                diVar2.getClass();
                diVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                di diVar3 = this.f36593b;
                vh vhVar = diVar3.f32955s2;
                ik ikVar = diVar3.f32936n2;
                if (vhVar == ikVar && ikVar != null) {
                    ikVar.invalidate();
                    return;
                }
                return;
            default:
                this.f36593b.Q1();
                return;
        }
    }
}
