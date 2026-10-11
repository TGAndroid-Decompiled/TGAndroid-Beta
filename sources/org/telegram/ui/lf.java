package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lf implements ValueAnimator.AnimatorUpdateListener {
    public final int f39648a;
    public final zn f39649b;
    public final View f39650c;

    public lf(zn znVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f39648a = i10;
        this.f39649b = znVar;
        this.f39650c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39648a) {
            case 0:
                zn znVar = this.f39649b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.t9();
                this.f39650c.setAlpha(floatValue);
                return;
            default:
                zn znVar2 = this.f39649b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.t9();
                znVar2.w9();
                this.f39650c.setAlpha(floatValue2);
                return;
        }
    }
}
