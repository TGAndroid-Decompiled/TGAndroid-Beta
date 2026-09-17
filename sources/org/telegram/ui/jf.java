package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jf implements ValueAnimator.AnimatorUpdateListener {
    public final int f37761a;
    public final co f37762b;
    public final View f37763c;

    public jf(co coVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f37761a = i10;
        this.f37762b = coVar;
        this.f37763c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37761a) {
            case 0:
                co coVar = this.f37762b;
                coVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                coVar.o9();
                this.f37763c.setAlpha(floatValue);
                return;
            default:
                co coVar2 = this.f37762b;
                coVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                coVar2.o9();
                coVar2.r9();
                this.f37763c.setAlpha(floatValue2);
                return;
        }
    }
}
