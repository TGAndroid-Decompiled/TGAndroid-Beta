package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mf implements ValueAnimator.AnimatorUpdateListener {
    public final int f39894a;
    public final zn f39895b;
    public final View f39896c;

    public mf(zn znVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f39894a = i10;
        this.f39895b = znVar;
        this.f39896c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39894a) {
            case 0:
                zn znVar = this.f39895b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.t9();
                this.f39896c.setAlpha(floatValue);
                return;
            default:
                zn znVar2 = this.f39895b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.t9();
                znVar2.w9();
                this.f39896c.setAlpha(floatValue2);
                return;
        }
    }
}
