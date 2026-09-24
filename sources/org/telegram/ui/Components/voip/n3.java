package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29505a;
    public final p3 f29506b;

    public n3(p3 p3Var, int i10) {
        this.f29505a = i10;
        this.f29506b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29505a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f29506b;
                p3Var.f29554n = floatValue;
                p3Var.f29551k.invalidate();
                if (p3Var.f29554n > 1.0f && p3Var.f29558r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f29558r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f29558r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f29558r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f29506b;
                p3Var2.f29553m = intValue;
                p3Var2.f29551k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f29506b;
                if (p3Var3.f29549i <= p3Var3.f29555o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f29556p = intValue2;
                p3Var3.f29551k.invalidate();
                return;
        }
    }
}
