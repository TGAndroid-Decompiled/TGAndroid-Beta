package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34889a;
    public final bo f34890b;
    public final View f34891c;

    public jf(bo boVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34889a = i10;
        this.f34890b = boVar;
        this.f34891c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34889a) {
            case 0:
                bo boVar = this.f34890b;
                boVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                boVar.o9();
                this.f34891c.setAlpha(floatValue);
                return;
            default:
                bo boVar2 = this.f34890b;
                boVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                boVar2.o9();
                boVar2.r9();
                this.f34891c.setAlpha(floatValue2);
                return;
        }
    }
}
