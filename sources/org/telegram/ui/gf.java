package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34437a;
    public final zn f34438b;
    public final View f34439c;

    public gf(zn znVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f34437a = i10;
        this.f34438b = znVar;
        this.f34439c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34437a) {
            case 0:
                zn znVar = this.f34438b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.f40809x9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.o9();
                this.f34439c.setAlpha(floatValue);
                return;
            default:
                zn znVar2 = this.f34438b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.f40809x9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.o9();
                znVar2.r9();
                this.f34439c.setAlpha(floatValue2);
                return;
        }
    }
}
