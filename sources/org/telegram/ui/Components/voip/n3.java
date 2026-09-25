package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29515a;
    public final p3 f29516b;

    public n3(p3 p3Var, int i10) {
        this.f29515a = i10;
        this.f29516b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29515a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f29516b;
                p3Var.f29564n = floatValue;
                p3Var.f29561k.invalidate();
                if (p3Var.f29564n > 1.0f && p3Var.f29568r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f29568r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f29568r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f29568r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f29516b;
                p3Var2.f29563m = intValue;
                p3Var2.f29561k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f29516b;
                if (p3Var3.f29559i <= p3Var3.f29565o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f29566p = intValue2;
                p3Var3.f29561k.invalidate();
                return;
        }
    }
}
