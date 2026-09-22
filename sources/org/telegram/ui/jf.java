package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34934a;
    public final zn f34935b;
    public final View f34936c;

    public jf(zn znVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34934a = i10;
        this.f34935b = znVar;
        this.f34936c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34934a) {
            case 0:
                zn znVar = this.f34935b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.o9();
                this.f34936c.setAlpha(floatValue);
                return;
            default:
                zn znVar2 = this.f34935b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.o9();
                znVar2.r9();
                this.f34936c.setAlpha(floatValue2);
                return;
        }
    }
}
