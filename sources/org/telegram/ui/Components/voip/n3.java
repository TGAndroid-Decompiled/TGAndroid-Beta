package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32105a;
    public final p3 f32106b;

    public n3(p3 p3Var, int i10) {
        this.f32105a = i10;
        this.f32106b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32105a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f32106b;
                p3Var.f32157n = floatValue;
                p3Var.f32154k.invalidate();
                if (p3Var.f32157n > 1.0f && p3Var.f32161r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f32161r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f32161r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f32161r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f32106b;
                p3Var2.f32156m = intValue;
                p3Var2.f32154k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f32106b;
                if (p3Var3.f32152i <= p3Var3.f32158o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f32159p = intValue2;
                p3Var3.f32154k.invalidate();
                return;
        }
    }
}
