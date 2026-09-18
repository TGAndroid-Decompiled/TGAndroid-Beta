package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29081a;
    public final o3 f29082b;

    public m3(o3 o3Var, int i10) {
        this.f29081a = i10;
        this.f29082b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29081a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f29082b;
                o3Var.f29112n = floatValue;
                o3Var.f29109k.invalidate();
                if (o3Var.f29112n > 1.0f && o3Var.f29116r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f29116r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f29116r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f29116r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f29082b;
                o3Var2.f29111m = intValue;
                o3Var2.f29109k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f29082b;
                if (o3Var3.f29107i <= o3Var3.f29113o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f29114p = intValue2;
                o3Var3.f29109k.invalidate();
                return;
        }
    }
}
