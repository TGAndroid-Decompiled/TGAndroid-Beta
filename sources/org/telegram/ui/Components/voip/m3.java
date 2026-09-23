package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29072a;
    public final o3 f29073b;

    public m3(o3 o3Var, int i10) {
        this.f29072a = i10;
        this.f29073b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29072a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f29073b;
                o3Var.f29103n = floatValue;
                o3Var.f29100k.invalidate();
                if (o3Var.f29103n > 1.0f && o3Var.f29107r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f29107r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f29107r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f29107r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f29073b;
                o3Var2.f29102m = intValue;
                o3Var2.f29100k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f29073b;
                if (o3Var3.f29098i <= o3Var3.f29104o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f29105p = intValue2;
                o3Var3.f29100k.invalidate();
                return;
        }
    }
}
