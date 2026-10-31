package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class gf implements ValueAnimator.AnimatorUpdateListener {
    public final int f37530a;
    public final un f37531b;
    public final View f37532c;

    public gf(un unVar, org.telegram.ui.Cells.s0 s0Var, int i10) {
        this.f37530a = i10;
        this.f37531b = unVar;
        this.f37532c = s0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37530a) {
            case 0:
                un unVar = this.f37531b;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.T9 = org.telegram.messenger.i0.L(30.0f) * floatValue;
                unVar.A9();
                this.f37532c.setAlpha(floatValue);
                return;
            default:
                un unVar2 = this.f37531b;
                unVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.T9 = org.telegram.messenger.i0.L(30.0f) * floatValue2;
                unVar2.A9();
                unVar2.C9();
                this.f37532c.setAlpha(floatValue2);
                return;
        }
    }
}
