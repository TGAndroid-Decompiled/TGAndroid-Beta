package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32165a;
    public final o3 f32166b;

    public m3(o3 o3Var, int i10) {
        this.f32165a = i10;
        this.f32166b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32165a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f32166b;
                o3Var.f32198n = floatValue;
                o3Var.f32195k.invalidate();
                if (o3Var.f32198n > 1.0f && o3Var.f32202r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f32202r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f32202r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f32202r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f32166b;
                o3Var2.f32197m = intValue;
                o3Var2.f32195k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f32166b;
                if (o3Var3.f32193i <= o3Var3.f32199o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f32200p = intValue2;
                o3Var3.f32195k.invalidate();
                return;
        }
    }
}
