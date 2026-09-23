package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34448a;
    public final xn f34449b;
    public final View f34450c;

    public jf(xn xnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34448a = i10;
        this.f34449b = xnVar;
        this.f34450c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34448a) {
            case 0:
                xn xnVar = this.f34449b;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                xnVar.o9();
                this.f34450c.setAlpha(floatValue);
                return;
            default:
                xn xnVar2 = this.f34449b;
                xnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                xnVar2.o9();
                xnVar2.r9();
                this.f34450c.setAlpha(floatValue2);
                return;
        }
    }
}
