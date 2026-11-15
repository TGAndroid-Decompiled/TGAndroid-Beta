package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tg implements ValueAnimator.AnimatorUpdateListener {
    public final int f39694a;
    public final ki f39695b;

    public tg(ki kiVar, int i7) {
        this.f39694a = i7;
        this.f39695b = kiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39694a) {
            case 0:
                this.f39695b.Q1();
                return;
            case 1:
                this.f39695b.B2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki kiVar = this.f39695b;
                kiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.k2 k2Var = kiVar.f29685c;
                if (k2Var != null) {
                    k2Var.invalidate();
                    return;
                }
                return;
            case 3:
                ki kiVar2 = this.f39695b;
                kiVar2.getClass();
                kiVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ki kiVar3 = this.f39695b;
                ci ciVar = kiVar3.f36509w2;
                qk qkVar = kiVar3.f36489r2;
                if (ciVar == qkVar && qkVar != null) {
                    qkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f39695b.Q1();
                return;
        }
    }
}
