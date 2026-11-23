package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f34779a;
    public final ui f34780b;

    public eh(ui uiVar, int i7) {
        this.f34779a = i7;
        this.f34780b = uiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34779a) {
            case 0:
                this.f34780b.R1();
                return;
            case 1:
                this.f34780b.B2.invalidate();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui uiVar = this.f34780b;
                uiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.m2 m2Var = uiVar.f30145c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    return;
                }
                return;
            case 3:
                ui uiVar2 = this.f34780b;
                uiVar2.getClass();
                uiVar2.A1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ui uiVar3 = this.f34780b;
                mi miVar = uiVar3.f40425w2;
                zk zkVar = uiVar3.f40405r2;
                if (miVar == zkVar && zkVar != null) {
                    zkVar.invalidate();
                    return;
                }
                return;
            default:
                this.f34780b.R1();
                return;
        }
    }
}
