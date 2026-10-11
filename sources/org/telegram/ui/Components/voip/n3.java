package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32159a;
    public final p3 f32160b;

    public n3(p3 p3Var, int i10) {
        this.f32159a = i10;
        this.f32160b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32159a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3 p3Var = this.f32160b;
                p3Var.f32192n = floatValue;
                p3Var.f32189k.invalidate();
                if (p3Var.f32192n > 1.0f && p3Var.f32196r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    p3Var.f32196r = ofInt;
                    ofInt.addUpdateListener(new n3(p3Var, 2));
                    p3Var.f32196r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    p3Var.f32196r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var2 = this.f32160b;
                p3Var2.f32191m = intValue;
                p3Var2.f32189k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p3 p3Var3 = this.f32160b;
                if (p3Var3.f32187i <= p3Var3.f32193o / 2) {
                    intValue2 = -intValue2;
                }
                p3Var3.f32194p = intValue2;
                p3Var3.f32189k.invalidate();
                return;
        }
    }
}
