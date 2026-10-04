package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32031a;
    public final p3 f32032b;

    public n3(p3 p3Var, int i10) {
        this.f32031a = i10;
        this.f32032b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32031a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f32032b;
                p3Var.f32083n = floatValue;
                p3Var.f32080k.invalidate();
                if (p3Var.f32083n > 1.0f && p3Var.f32087r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f32087r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f32087r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f32087r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f32032b;
                p3Var2.f32082m = intValue;
                p3Var2.f32080k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f32032b;
                if (p3Var3.f32078i <= p3Var3.f32084o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f32085p = intValue2;
                p3Var3.f32080k.invalidate();
                return;
        }
    }
}
