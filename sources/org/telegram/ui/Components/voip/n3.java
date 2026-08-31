package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32212a;
    public final p3 f32213b;

    public n3(p3 p3Var, int i10) {
        this.f32212a = i10;
        this.f32213b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32212a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f32213b;
                p3Var.f32273n = floatValue;
                p3Var.f32270k.invalidate();
                if (p3Var.f32273n > 1.0f && p3Var.f32277r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f32277r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f32277r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f32277r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f32213b;
                p3Var2.f32272m = intValue;
                p3Var2.f32270k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f32213b;
                if (p3Var3.f32268i <= p3Var3.f32274o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f32275p = intValue2;
                p3Var3.f32270k.invalidate();
                return;
        }
    }
}
