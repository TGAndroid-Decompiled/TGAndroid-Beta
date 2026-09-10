package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28281a;
    public final o3 f28282b;

    public m3(o3 o3Var, int i10) {
        this.f28281a = i10;
        this.f28282b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28281a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f28282b;
                o3Var.f28322n = floatValue;
                o3Var.f28319k.invalidate();
                if (o3Var.f28322n > 1.0f && o3Var.f28326r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f28326r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f28326r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f28326r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f28282b;
                o3Var2.f28321m = intValue;
                o3Var2.f28319k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f28282b;
                if (o3Var3.f28317i <= o3Var3.f28323o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f28324p = intValue2;
                o3Var3.f28319k.invalidate();
                return;
        }
    }
}
