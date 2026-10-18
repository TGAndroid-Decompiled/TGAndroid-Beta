package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31553a;
    public final m3 f31554b;

    public k3(m3 m3Var, int i10) {
        this.f31553a = i10;
        this.f31554b = m3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31553a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3 m3Var = this.f31554b;
                m3Var.f31621n = floatValue;
                m3Var.f31618k.invalidate();
                if (m3Var.f31621n > 1.0f && m3Var.f31625r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    m3Var.f31625r = ofInt;
                    ofInt.addUpdateListener(new k3(m3Var, 2));
                    m3Var.f31625r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    m3Var.f31625r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var2 = this.f31554b;
                m3Var2.f31620m = intValue;
                m3Var2.f31618k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var3 = this.f31554b;
                if (m3Var3.f31616i <= m3Var3.f31622o / 2) {
                    intValue2 = -intValue2;
                }
                m3Var3.f31623p = intValue2;
                m3Var3.f31618k.invalidate();
                return;
        }
    }
}
