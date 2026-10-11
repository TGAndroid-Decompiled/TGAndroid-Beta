package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32223a;
    public final p3 f32224b;

    public n3(p3 p3Var, int i10) {
        this.f32223a = i10;
        this.f32224b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32223a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f32224b;
                p3Var.f32256n = floatValue;
                p3Var.f32253k.invalidate();
                if (p3Var.f32256n > 1.0f && p3Var.f32260r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f32260r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f32260r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f32260r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f32224b;
                p3Var2.f32255m = intValue;
                p3Var2.f32253k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f32224b;
                if (p3Var3.f32251i <= p3Var3.f32257o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f32258p = intValue2;
                p3Var3.f32253k.invalidate();
                return;
        }
    }
}
