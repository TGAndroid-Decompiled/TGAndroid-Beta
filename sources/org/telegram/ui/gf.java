package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gf implements ValueAnimator.AnimatorUpdateListener {
    public final int f37203a;
    public final sn f37204b;
    public final View f37205c;

    public gf(sn snVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f37203a = i10;
        this.f37204b = snVar;
        this.f37205c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37203a) {
            case 0:
                sn snVar = this.f37204b;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                snVar.t9();
                this.f37205c.setAlpha(floatValue);
                return;
            default:
                sn snVar2 = this.f37204b;
                snVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                snVar2.t9();
                snVar2.w9();
                this.f37205c.setAlpha(floatValue2);
                return;
        }
    }
}
