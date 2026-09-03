package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ef implements ValueAnimator.AnimatorUpdateListener {
    public final int f36471a;
    public final xn f36472b;
    public final View f36473c;

    public ef(xn xnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f36471a = i10;
        this.f36472b = xnVar;
        this.f36473c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36471a) {
            case 0:
                xn xnVar = this.f36472b;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.f43390x9 = AndroidUtilities.dp(30.0f) * floatValue;
                xnVar.o9();
                this.f36473c.setAlpha(floatValue);
                return;
            default:
                xn xnVar2 = this.f36472b;
                xnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.f43390x9 = AndroidUtilities.dp(30.0f) * floatValue2;
                xnVar2.o9();
                xnVar2.r9();
                this.f36473c.setAlpha(floatValue2);
                return;
        }
    }
}
