package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34694a;
    public final eo f34695b;
    public final View f34696c;

    public lf(eo eoVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34694a = i10;
        this.f34695b = eoVar;
        this.f34696c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34694a) {
            case 0:
                eo eoVar = this.f34695b;
                eoVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                eoVar.o9();
                this.f34696c.setAlpha(floatValue);
                return;
            default:
                eo eoVar2 = this.f34695b;
                eoVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                eoVar2.o9();
                eoVar2.r9();
                this.f34696c.setAlpha(floatValue2);
                return;
        }
    }
}
