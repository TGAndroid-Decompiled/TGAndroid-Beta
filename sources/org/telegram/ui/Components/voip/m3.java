package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29782a;
    public final o3 f29783b;

    public m3(o3 o3Var, int i10) {
        this.f29782a = i10;
        this.f29783b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29782a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f29783b;
                o3Var.f29839n = floatValue;
                o3Var.f29836k.invalidate();
                if (o3Var.f29839n > 1.0f && o3Var.f29843r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f29843r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f29843r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f29843r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f29783b;
                o3Var2.f29838m = intValue;
                o3Var2.f29836k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f29783b;
                if (o3Var3.f29834i <= o3Var3.f29840o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f29841p = intValue2;
                o3Var3.f29836k.invalidate();
                return;
        }
    }
}
