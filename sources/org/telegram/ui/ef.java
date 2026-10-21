package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ef implements ValueAnimator.AnimatorUpdateListener {
    public final int f36649a;
    public final qn f36650b;
    public final View f36651c;

    public ef(qn qnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f36649a = i10;
        this.f36650b = qnVar;
        this.f36651c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36649a) {
            case 0:
                qn qnVar = this.f36650b;
                qnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                qnVar.t9();
                this.f36651c.setAlpha(floatValue);
                return;
            default:
                qn qnVar2 = this.f36650b;
                qnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                qnVar2.t9();
                qnVar2.w9();
                this.f36651c.setAlpha(floatValue2);
                return;
        }
    }
}
