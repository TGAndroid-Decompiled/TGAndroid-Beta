package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ef implements ValueAnimator.AnimatorUpdateListener {
    public final int f36894a;
    public final sn f36895b;
    public final View f36896c;

    public ef(sn snVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f36894a = i10;
        this.f36895b = snVar;
        this.f36896c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36894a) {
            case 0:
                sn snVar = this.f36895b;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.M9 = AndroidUtilities.dp(30.0f) * floatValue;
                snVar.t9();
                this.f36896c.setAlpha(floatValue);
                return;
            default:
                sn snVar2 = this.f36895b;
                snVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.M9 = AndroidUtilities.dp(30.0f) * floatValue2;
                snVar2.t9();
                snVar2.w9();
                this.f36896c.setAlpha(floatValue2);
                return;
        }
    }
}
