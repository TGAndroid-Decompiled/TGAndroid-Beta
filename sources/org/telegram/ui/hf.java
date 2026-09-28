package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34207a;
    public final wn f34208b;
    public final View f34209c;

    public hf(wn wnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34207a = i10;
        this.f34208b = wnVar;
        this.f34209c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34207a) {
            case 0:
                wn wnVar = this.f34208b;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                wnVar.o9();
                this.f34209c.setAlpha(floatValue);
                return;
            default:
                wn wnVar2 = this.f34208b;
                wnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                wnVar2.o9();
                wnVar2.r9();
                this.f34209c.setAlpha(floatValue2);
                return;
        }
    }
}
