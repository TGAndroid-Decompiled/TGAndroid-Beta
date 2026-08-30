package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ef implements ValueAnimator.AnimatorUpdateListener {
    public final int f34005a;
    public final xn f34006b;
    public final View f34007c;

    public ef(xn xnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f34005a = i10;
        this.f34006b = xnVar;
        this.f34007c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34005a) {
            case 0:
                xn xnVar = this.f34006b;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.f40243x9 = AndroidUtilities.dp(30.0f) * floatValue;
                xnVar.o9();
                this.f34007c.setAlpha(floatValue);
                return;
            default:
                xn xnVar2 = this.f34006b;
                xnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.f40243x9 = AndroidUtilities.dp(30.0f) * floatValue2;
                xnVar2.o9();
                xnVar2.r9();
                this.f34007c.setAlpha(floatValue2);
                return;
        }
    }
}
