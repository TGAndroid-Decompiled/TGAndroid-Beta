package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29466a;
    public final o3 f29467b;

    public m3(o3 o3Var, int i10) {
        this.f29466a = i10;
        this.f29467b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29466a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f29467b;
                o3Var.f29497n = floatValue;
                o3Var.f29494k.invalidate();
                if (o3Var.f29497n > 1.0f && o3Var.f29501r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f29501r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f29501r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f29501r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f29467b;
                o3Var2.f29496m = intValue;
                o3Var2.f29494k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f29467b;
                if (o3Var3.f29492i <= o3Var3.f29498o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f29499p = intValue2;
                o3Var3.f29494k.invalidate();
                return;
        }
    }
}
