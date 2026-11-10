package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ng implements ValueAnimator.AnimatorUpdateListener {
    public final int f36304a;
    public final ci f36305b;

    public ng(ci ciVar, int i7) {
        this.f36304a = i7;
        this.f36305b = ciVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36304a) {
            case 0:
                this.f36305b.Q1();
                return;
            case 1:
                this.f36305b.A2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci ciVar = this.f36305b;
                ciVar.C0 = floatValue;
                org.telegram.ui.ActionBar.m2 m2Var = ciVar.f28675c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    return;
                }
                return;
            case 3:
                ci ciVar2 = this.f36305b;
                ciVar2.getClass();
                ciVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ci ciVar3 = this.f36305b;
                uh uhVar = ciVar3.f32660v2;
                hk hkVar = ciVar3.f32640q2;
                if (uhVar == hkVar && hkVar != null) {
                    hkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f36305b.Q1();
                return;
        }
    }
}
