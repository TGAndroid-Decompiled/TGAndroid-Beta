package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34898a;
    public final bo f34899b;
    public final View f34900c;

    public jf(bo boVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34898a = i10;
        this.f34899b = boVar;
        this.f34900c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34898a) {
            case 0:
                bo boVar = this.f34899b;
                boVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                boVar.o9();
                this.f34900c.setAlpha(floatValue);
                return;
            default:
                bo boVar2 = this.f34899b;
                boVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                boVar2.o9();
                boVar2.r9();
                this.f34900c.setAlpha(floatValue2);
                return;
        }
    }
}
