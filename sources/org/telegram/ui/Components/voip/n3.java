package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29426a;
    public final p3 f29427b;

    public n3(p3 p3Var, int i10) {
        this.f29426a = i10;
        this.f29427b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29426a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f29427b;
                p3Var.f29475n = floatValue;
                p3Var.f29472k.invalidate();
                if (p3Var.f29475n > 1.0f && p3Var.f29479r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f29479r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f29479r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f29479r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f29427b;
                p3Var2.f29474m = intValue;
                p3Var2.f29472k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f29427b;
                if (p3Var3.f29470i <= p3Var3.f29476o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f29477p = intValue2;
                p3Var3.f29472k.invalidate();
                return;
        }
    }
}
