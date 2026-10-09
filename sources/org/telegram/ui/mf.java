package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mf implements ValueAnimator.AnimatorUpdateListener {
    public final int f39892a;
    public final zn f39893b;
    public final View f39894c;

    public mf(zn znVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f39892a = i10;
        this.f39893b = znVar;
        this.f39894c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39892a) {
            case 0:
                zn znVar = this.f39893b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.t9();
                this.f39894c.setAlpha(floatValue);
                return;
            default:
                zn znVar2 = this.f39893b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.t9();
                znVar2.w9();
                this.f39894c.setAlpha(floatValue2);
                return;
        }
    }
}
