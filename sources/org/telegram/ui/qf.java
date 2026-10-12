package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qf implements ValueAnimator.AnimatorUpdateListener {
    public final int f41313a;
    public final eo f41314b;
    public final View f41315c;

    public qf(eo eoVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f41313a = i10;
        this.f41314b = eoVar;
        this.f41315c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41313a) {
            case 0:
                eo eoVar = this.f41314b;
                eoVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                eoVar.t9();
                this.f41315c.setAlpha(floatValue);
                return;
            default:
                eo eoVar2 = this.f41314b;
                eoVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                eoVar2.t9();
                eoVar2.w9();
                this.f41315c.setAlpha(floatValue2);
                return;
        }
    }
}
