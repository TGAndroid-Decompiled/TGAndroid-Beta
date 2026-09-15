package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29101a;
    public final o3 f29102b;

    public m3(o3 o3Var, int i10) {
        this.f29101a = i10;
        this.f29102b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29101a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f29102b;
                o3Var.f29132n = floatValue;
                o3Var.f29129k.invalidate();
                if (o3Var.f29132n > 1.0f && o3Var.f29136r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f29136r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f29136r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f29136r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f29102b;
                o3Var2.f29131m = intValue;
                o3Var2.f29129k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f29102b;
                if (o3Var3.f29127i <= o3Var3.f29133o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f29134p = intValue2;
                o3Var3.f29129k.invalidate();
                return;
        }
    }
}
