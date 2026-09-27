package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29457a;
    public final p3 f29458b;

    public n3(p3 p3Var, int i10) {
        this.f29457a = i10;
        this.f29458b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29457a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f29458b;
                p3Var.f29506n = floatValue;
                p3Var.f29503k.invalidate();
                if (p3Var.f29506n > 1.0f && p3Var.f29510r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f29510r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f29510r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f29510r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f29458b;
                p3Var2.f29505m = intValue;
                p3Var2.f29503k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f29458b;
                if (p3Var3.f29501i <= p3Var3.f29507o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f29508p = intValue2;
                p3Var3.f29503k.invalidate();
                return;
        }
    }
}
