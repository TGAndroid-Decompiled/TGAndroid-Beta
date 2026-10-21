package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31507a;
    public final m3 f31508b;

    public k3(m3 m3Var, int i10) {
        this.f31507a = i10;
        this.f31508b = m3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31507a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3 m3Var = this.f31508b;
                m3Var.f31575n = floatValue;
                m3Var.f31572k.invalidate();
                if (m3Var.f31575n > 1.0f && m3Var.f31579r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    m3Var.f31579r = ofInt;
                    ofInt.addUpdateListener(new k3(m3Var, 2));
                    m3Var.f31579r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    m3Var.f31579r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var2 = this.f31508b;
                m3Var2.f31574m = intValue;
                m3Var2.f31572k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var3 = this.f31508b;
                if (m3Var3.f31570i <= m3Var3.f31576o / 2) {
                    intValue2 = -intValue2;
                }
                m3Var3.f31577p = intValue2;
                m3Var3.f31572k.invalidate();
                return;
        }
    }
}
