package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class df implements ValueAnimator.AnimatorUpdateListener {
    public final int f38597a;
    public final wn f38598b;
    public final View f38599c;

    public df(wn wnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f38597a = i10;
        this.f38598b = wnVar;
        this.f38599c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38597a) {
            case 0:
                wn wnVar = this.f38598b;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.Q9 = AndroidUtilities.dp(30.0f) * floatValue;
                wnVar.A9();
                this.f38599c.setAlpha(floatValue);
                return;
            default:
                wn wnVar2 = this.f38598b;
                wnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.Q9 = AndroidUtilities.dp(30.0f) * floatValue2;
                wnVar2.A9();
                wnVar2.C9();
                this.f38599c.setAlpha(floatValue2);
                return;
        }
    }
}
