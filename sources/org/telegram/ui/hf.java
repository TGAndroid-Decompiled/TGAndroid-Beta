package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hf implements ValueAnimator.AnimatorUpdateListener {
    public final int f34206a;
    public final wn f34207b;
    public final View f34208c;

    public hf(wn wnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f34206a = i10;
        this.f34207b = wnVar;
        this.f34208c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34206a) {
            case 0:
                wn wnVar = this.f34207b;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                wnVar.o9();
                this.f34208c.setAlpha(floatValue);
                return;
            default:
                wn wnVar2 = this.f34207b;
                wnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                wnVar2.o9();
                wnVar2.r9();
                this.f34208c.setAlpha(floatValue2);
                return;
        }
    }
}
