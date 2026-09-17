package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jf implements ValueAnimator.AnimatorUpdateListener {
    public final int f37788a;
    public final co f37789b;
    public final View f37790c;

    public jf(co coVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f37788a = i10;
        this.f37789b = coVar;
        this.f37790c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37788a) {
            case 0:
                co coVar = this.f37789b;
                coVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                coVar.o9();
                this.f37790c.setAlpha(floatValue);
                return;
            default:
                co coVar2 = this.f37789b;
                coVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                coVar2.o9();
                coVar2.r9();
                this.f37790c.setAlpha(floatValue2);
                return;
        }
    }
}
