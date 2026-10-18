package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gf implements ValueAnimator.AnimatorUpdateListener {
    public final int f37168a;
    public final sn f37169b;
    public final View f37170c;

    public gf(sn snVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f37168a = i10;
        this.f37169b = snVar;
        this.f37170c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37168a) {
            case 0:
                sn snVar = this.f37169b;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                snVar.t9();
                this.f37170c.setAlpha(floatValue);
                return;
            default:
                sn snVar2 = this.f37169b;
                snVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                snVar2.t9();
                snVar2.w9();
                this.f37170c.setAlpha(floatValue2);
                return;
        }
    }
}
