package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29098a;
    public final o3 f29099b;

    public m3(o3 o3Var, int i10) {
        this.f29098a = i10;
        this.f29099b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29098a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3 o3Var = this.f29099b;
                o3Var.f29129n = floatValue;
                o3Var.f29126k.invalidate();
                if (o3Var.f29129n > 1.0f && o3Var.f29133r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    o3Var.f29133r = ofInt;
                    ofInt.addUpdateListener(new m3(o3Var, 2));
                    o3Var.f29133r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    o3Var.f29133r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var2 = this.f29099b;
                o3Var2.f29128m = intValue;
                o3Var2.f29126k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o3 o3Var3 = this.f29099b;
                if (o3Var3.f29124i <= o3Var3.f29130o / 2) {
                    intValue2 = -intValue2;
                }
                o3Var3.f29131p = intValue2;
                o3Var3.f29126k.invalidate();
                return;
        }
    }
}
