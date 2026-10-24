package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31662a;
    public final m3 f31663b;

    public k3(m3 m3Var, int i10) {
        this.f31662a = i10;
        this.f31663b = m3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31662a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3 m3Var = this.f31663b;
                m3Var.f31730n = floatValue;
                m3Var.f31727k.invalidate();
                if (m3Var.f31730n > 1.0f && m3Var.f31734r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    m3Var.f31734r = ofInt;
                    ofInt.addUpdateListener(new k3(m3Var, 2));
                    m3Var.f31734r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    m3Var.f31734r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var2 = this.f31663b;
                m3Var2.f31729m = intValue;
                m3Var2.f31727k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var3 = this.f31663b;
                if (m3Var3.f31725i <= m3Var3.f31731o / 2) {
                    intValue2 = -intValue2;
                }
                m3Var3.f31732p = intValue2;
                m3Var3.f31727k.invalidate();
                return;
        }
    }
}
