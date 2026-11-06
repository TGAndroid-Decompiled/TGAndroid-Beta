package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class og implements ValueAnimator.AnimatorUpdateListener {
    public final int f36714a;
    public final di f36715b;

    public og(di diVar, int i7) {
        this.f36714a = i7;
        this.f36715b = diVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36714a) {
            case 0:
                this.f36715b.Q1();
                return;
            case 1:
                this.f36715b.f32962x2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di diVar = this.f36715b;
                diVar.C0 = floatValue;
                org.telegram.ui.ActionBar.l2 l2Var = diVar.f28618c;
                if (l2Var != null) {
                    l2Var.invalidate();
                    return;
                }
                return;
            case 3:
                di diVar2 = this.f36715b;
                diVar2.getClass();
                diVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                di diVar3 = this.f36715b;
                vh vhVar = diVar3.f32942s2;
                ik ikVar = diVar3.f32923n2;
                if (vhVar == ikVar && ikVar != null) {
                    ikVar.invalidate();
                    return;
                }
                return;
            default:
                this.f36715b.Q1();
                return;
        }
    }
}
