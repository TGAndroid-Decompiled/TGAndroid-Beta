package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34854a;
    public final zn f34855b;
    public final View f34856c;

    public jf(zn znVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34854a = i10;
        this.f34855b = znVar;
        this.f34856c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34854a) {
            case 0:
                zn znVar = this.f34855b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.o9();
                this.f34856c.setAlpha(floatValue);
                return;
            default:
                zn znVar2 = this.f34855b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.o9();
                znVar2.r9();
                this.f34856c.setAlpha(floatValue2);
                return;
        }
    }
}
