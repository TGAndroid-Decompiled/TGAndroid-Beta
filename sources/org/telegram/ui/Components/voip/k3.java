package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31615a;
    public final m3 f31616b;

    public k3(m3 m3Var, int i10) {
        this.f31615a = i10;
        this.f31616b = m3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31615a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3 m3Var = this.f31616b;
                m3Var.f31687n = floatValue;
                m3Var.f31684k.invalidate();
                if (m3Var.f31687n > 1.0f && m3Var.f31691r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    m3Var.f31691r = ofInt;
                    ofInt.addUpdateListener(new k3(m3Var, 2));
                    m3Var.f31691r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    m3Var.f31691r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var2 = this.f31616b;
                m3Var2.f31686m = intValue;
                m3Var2.f31684k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var3 = this.f31616b;
                if (m3Var3.f31682i <= m3Var3.f31688o / 2) {
                    intValue2 = -intValue2;
                }
                m3Var3.f31689p = intValue2;
                m3Var3.f31684k.invalidate();
                return;
        }
    }
}
