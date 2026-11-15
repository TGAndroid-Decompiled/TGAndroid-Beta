package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tg implements ValueAnimator.AnimatorUpdateListener {
    public final int f39691a;
    public final ki f39692b;

    public tg(ki kiVar, int i7) {
        this.f39691a = i7;
        this.f39692b = kiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39691a) {
            case 0:
                this.f39692b.Q1();
                return;
            case 1:
                this.f39692b.B2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki kiVar = this.f39692b;
                kiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.k2 k2Var = kiVar.f29685c;
                if (k2Var != null) {
                    k2Var.invalidate();
                    return;
                }
                return;
            case 3:
                ki kiVar2 = this.f39692b;
                kiVar2.getClass();
                kiVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ki kiVar3 = this.f39692b;
                ci ciVar = kiVar3.f36497w2;
                qk qkVar = kiVar3.f36477r2;
                if (ciVar == qkVar && qkVar != null) {
                    qkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f39692b.Q1();
                return;
        }
    }
}
