package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31506a;
    public final m3 f31507b;

    public k3(m3 m3Var, int i10) {
        this.f31506a = i10;
        this.f31507b = m3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31506a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3 m3Var = this.f31507b;
                m3Var.f31574n = floatValue;
                m3Var.f31571k.invalidate();
                if (m3Var.f31574n > 1.0f && m3Var.f31578r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    m3Var.f31578r = ofInt;
                    ofInt.addUpdateListener(new k3(m3Var, 2));
                    m3Var.f31578r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    m3Var.f31578r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var2 = this.f31507b;
                m3Var2.f31573m = intValue;
                m3Var2.f31571k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var3 = this.f31507b;
                if (m3Var3.f31569i <= m3Var3.f31575o / 2) {
                    intValue2 = -intValue2;
                }
                m3Var3.f31576p = intValue2;
                m3Var3.f31571k.invalidate();
                return;
        }
    }
}
