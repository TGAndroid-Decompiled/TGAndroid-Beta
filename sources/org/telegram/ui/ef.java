package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ef implements ValueAnimator.AnimatorUpdateListener {
    public final int f36652a;
    public final qn f36653b;
    public final View f36654c;

    public ef(qn qnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f36652a = i10;
        this.f36653b = qnVar;
        this.f36654c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36652a) {
            case 0:
                qn qnVar = this.f36653b;
                qnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                qnVar.t9();
                this.f36654c.setAlpha(floatValue);
                return;
            default:
                qn qnVar2 = this.f36653b;
                qnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                qnVar2.t9();
                qnVar2.w9();
                this.f36654c.setAlpha(floatValue2);
                return;
        }
    }
}
