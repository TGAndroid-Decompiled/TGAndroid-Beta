package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lf implements ValueAnimator.AnimatorUpdateListener {
    public final int f39682a;
    public final zn f39683b;
    public final View f39684c;

    public lf(zn znVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f39682a = i10;
        this.f39683b = znVar;
        this.f39684c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39682a) {
            case 0:
                zn znVar = this.f39683b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.t9();
                this.f39684c.setAlpha(floatValue);
                return;
            default:
                zn znVar2 = this.f39683b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.t9();
                znVar2.w9();
                this.f39684c.setAlpha(floatValue2);
                return;
        }
    }
}
