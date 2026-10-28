package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34071a;
    public final p3 f34072b;

    public n3(p3 p3Var, int i10) {
        this.f34071a = i10;
        this.f34072b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34071a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f34072b;
                p3Var.f34121n = floatValue;
                p3Var.f34118k.invalidate();
                if (p3Var.f34121n > 1.0f && p3Var.f34125r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f34125r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f34125r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f34125r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f34072b;
                p3Var2.f34120m = intValue;
                p3Var2.f34118k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f34072b;
                if (p3Var3.f34116i <= p3Var3.f34122o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f34123p = intValue2;
                p3Var3.f34118k.invalidate();
                return;
        }
    }
}
