package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ff implements ValueAnimator.AnimatorUpdateListener {
    public final int f37120a;
    public final un f37121b;
    public final View f37122c;

    public ff(un unVar, org.telegram.ui.Cells.s0 s0Var, int i10) {
        this.f37120a = i10;
        this.f37121b = unVar;
        this.f37122c = s0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37120a) {
            case 0:
                un unVar = this.f37121b;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.T9 = org.telegram.messenger.i0.L(30.0f) * floatValue;
                unVar.F9();
                this.f37122c.setAlpha(floatValue);
                return;
            default:
                un unVar2 = this.f37121b;
                unVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.T9 = org.telegram.messenger.i0.L(30.0f) * floatValue2;
                unVar2.F9();
                unVar2.H9();
                this.f37122c.setAlpha(floatValue2);
                return;
        }
    }
}
