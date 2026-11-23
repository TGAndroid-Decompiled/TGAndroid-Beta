package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dh implements ValueAnimator.AnimatorUpdateListener {
    public final int f34329a;
    public final ti f34330b;

    public dh(ti tiVar, int i7) {
        this.f34329a = i7;
        this.f34330b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34329a) {
            case 0:
                this.f34330b.R1();
                return;
            case 1:
                this.f34330b.B2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = this.f34330b;
                tiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.m2 m2Var = tiVar.f30229c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    return;
                }
                return;
            case 3:
                ti tiVar2 = this.f34330b;
                tiVar2.getClass();
                tiVar2.A1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar3 = this.f34330b;
                li liVar = tiVar3.f40029w2;
                xk xkVar = tiVar3.f40009r2;
                if (liVar == xkVar && xkVar != null) {
                    xkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f34330b.R1();
                return;
        }
    }
}
