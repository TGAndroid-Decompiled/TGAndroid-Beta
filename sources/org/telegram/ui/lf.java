package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lf implements ValueAnimator.AnimatorUpdateListener {
    public final int f35338a;
    public final xn f35339b;
    public final View f35340c;

    public lf(xn xnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f35338a = i10;
        this.f35339b = xnVar;
        this.f35340c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35338a) {
            case 0:
                xn xnVar = this.f35339b;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                xnVar.o9();
                this.f35340c.setAlpha(floatValue);
                return;
            default:
                xn xnVar2 = this.f35339b;
                xnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                xnVar2.o9();
                xnVar2.r9();
                this.f35340c.setAlpha(floatValue2);
                return;
        }
    }
}
