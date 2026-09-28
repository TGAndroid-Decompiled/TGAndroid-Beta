package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29435a;
    public final p3 f29436b;

    public n3(p3 p3Var, int i10) {
        this.f29435a = i10;
        this.f29436b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29435a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f29436b;
                p3Var.f29484n = floatValue;
                p3Var.f29481k.invalidate();
                if (p3Var.f29484n > 1.0f && p3Var.f29488r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f29488r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f29488r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f29488r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f29436b;
                p3Var2.f29483m = intValue;
                p3Var2.f29481k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f29436b;
                if (p3Var3.f29479i <= p3Var3.f29485o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f29486p = intValue2;
                p3Var3.f29481k.invalidate();
                return;
        }
    }
}
