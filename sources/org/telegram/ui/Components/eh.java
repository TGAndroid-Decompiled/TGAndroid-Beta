package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f34793a;
    public final ui f34794b;

    public eh(ui uiVar, int i7) {
        this.f34793a = i7;
        this.f34794b = uiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34793a) {
            case 0:
                this.f34794b.R1();
                return;
            case 1:
                this.f34794b.B2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui uiVar = this.f34794b;
                uiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.m2 m2Var = uiVar.f30179c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    return;
                }
                return;
            case 3:
                ui uiVar2 = this.f34794b;
                uiVar2.getClass();
                uiVar2.A1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ui uiVar3 = this.f34794b;
                mi miVar = uiVar3.f40441w2;
                zk zkVar = uiVar3.f40421r2;
                if (miVar == zkVar && zkVar != null) {
                    zkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f34794b.R1();
                return;
        }
    }
}
