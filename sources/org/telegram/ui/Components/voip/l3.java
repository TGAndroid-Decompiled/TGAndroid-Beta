package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33663a;
    public final n3 f33664b;

    public l3(n3 n3Var, int i9) {
        this.f33663a = i9;
        this.f33664b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33663a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3 n3Var = this.f33664b;
                n3Var.f33710n = floatValue;
                n3Var.f33707k.invalidate();
                if (n3Var.f33710n > 1.0f && n3Var.f33714r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    n3Var.f33714r = ofInt;
                    ofInt.addUpdateListener(new l3(n3Var, 2));
                    n3Var.f33714r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    n3Var.f33714r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var2 = this.f33664b;
                n3Var2.f33709m = intValue;
                n3Var2.f33707k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var3 = this.f33664b;
                if (n3Var3.f33705i <= n3Var3.f33711o / 2) {
                    intValue2 = -intValue2;
                }
                n3Var3.f33712p = intValue2;
                n3Var3.f33707k.invalidate();
                return;
        }
    }
}
