package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lf implements ValueAnimator.AnimatorUpdateListener {
    public final int f35538a;
    public final bo f35539b;
    public final View f35540c;

    public lf(bo boVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f35538a = i10;
        this.f35539b = boVar;
        this.f35540c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35538a) {
            case 0:
                bo boVar = this.f35539b;
                boVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                boVar.o9();
                this.f35540c.setAlpha(floatValue);
                return;
            default:
                bo boVar2 = this.f35539b;
                boVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                boVar2.o9();
                boVar2.r9();
                this.f35540c.setAlpha(floatValue2);
                return;
        }
    }
}
