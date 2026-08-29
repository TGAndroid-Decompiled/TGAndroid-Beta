package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class o3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33905a;
    public final q3 f33906b;

    public o3(q3 q3Var, int i10) {
        this.f33905a = i10;
        this.f33906b = q3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33905a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3 q3Var = this.f33906b;
                q3Var.f33955n = floatValue;
                q3Var.f33952k.invalidate();
                if (q3Var.f33955n > 1.0f && q3Var.f33959r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    q3Var.f33959r = ofInt;
                    ofInt.addUpdateListener(new o3(q3Var, 2));
                    q3Var.f33959r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    q3Var.f33959r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q3 q3Var2 = this.f33906b;
                q3Var2.f33954m = intValue;
                q3Var2.f33952k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q3 q3Var3 = this.f33906b;
                if (q3Var3.f33950i <= q3Var3.f33956o / 2) {
                    intValue2 = -intValue2;
                }
                q3Var3.f33957p = intValue2;
                q3Var3.f33952k.invalidate();
                return;
        }
    }
}
