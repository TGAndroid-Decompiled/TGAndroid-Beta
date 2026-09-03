package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32217a;
    public final p3 f32218b;

    public n3(p3 p3Var, int i10) {
        this.f32217a = i10;
        this.f32218b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32217a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f32218b;
                p3Var.f32278n = floatValue;
                p3Var.f32275k.invalidate();
                if (p3Var.f32278n > 1.0f && p3Var.f32282r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f32282r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f32282r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f32282r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f32218b;
                p3Var2.f32277m = intValue;
                p3Var2.f32275k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f32218b;
                if (p3Var3.f32273i <= p3Var3.f32279o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f32280p = intValue2;
                p3Var3.f32275k.invalidate();
                return;
        }
    }
}
