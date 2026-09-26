package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29431a;
    public final p3 f29432b;

    public n3(p3 p3Var, int i10) {
        this.f29431a = i10;
        this.f29432b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29431a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f29432b;
                p3Var.f29480n = floatValue;
                p3Var.f29477k.invalidate();
                if (p3Var.f29480n > 1.0f && p3Var.f29484r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f29484r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f29484r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f29484r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f29432b;
                p3Var2.f29479m = intValue;
                p3Var2.f29477k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f29432b;
                if (p3Var3.f29475i <= p3Var3.f29481o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f29482p = intValue2;
                p3Var3.f29477k.invalidate();
                return;
        }
    }
}
