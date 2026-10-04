package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lf implements ValueAnimator.AnimatorUpdateListener {
    public final int f38252a;
    public final yn f38253b;
    public final View f38254c;

    public lf(yn ynVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f38252a = i10;
        this.f38253b = ynVar;
        this.f38254c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38252a) {
            case 0:
                yn ynVar = this.f38253b;
                ynVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar.f43572y9 = AndroidUtilities.dp(30.0f) * floatValue;
                ynVar.o9();
                this.f38254c.setAlpha(floatValue);
                return;
            default:
                yn ynVar2 = this.f38253b;
                ynVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar2.f43572y9 = AndroidUtilities.dp(30.0f) * floatValue2;
                ynVar2.o9();
                ynVar2.q9();
                this.f38254c.setAlpha(floatValue2);
                return;
        }
    }
}
