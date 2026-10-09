package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32100a;
    public final o3 f32101b;

    public m3(o3 o3Var, int i10) {
        this.f32100a = i10;
        this.f32101b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32100a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f32101b;
                o3Var.f32133n = floatValue;
                o3Var.f32130k.invalidate();
                if (o3Var.f32133n > 1.0f && o3Var.f32137r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f32137r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f32137r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f32137r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f32101b;
                o3Var2.f32132m = intValue;
                o3Var2.f32130k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f32101b;
                if (o3Var3.f32128i <= o3Var3.f32134o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f32135p = intValue2;
                o3Var3.f32130k.invalidate();
                return;
        }
    }
}
