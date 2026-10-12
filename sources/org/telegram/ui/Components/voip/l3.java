package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30321a;
    public final n3 f30322b;

    public l3(n3 n3Var, int i10) {
        this.f30321a = i10;
        this.f30322b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30321a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3 n3Var = this.f30322b;
                n3Var.f30349n = floatValue;
                n3Var.f30346k.invalidate();
                if (n3Var.f30349n > 1.0f && n3Var.f30353r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    n3Var.f30353r = ofInt;
                    ofInt.addUpdateListener(new l3(n3Var, 2));
                    n3Var.f30353r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    n3Var.f30353r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var2 = this.f30322b;
                n3Var2.f30348m = intValue;
                n3Var2.f30346k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var3 = this.f30322b;
                if (n3Var3.f30344i <= n3Var3.f30350o / 2) {
                    intValue2 = -intValue2;
                }
                n3Var3.f30351p = intValue2;
                n3Var3.f30346k.invalidate();
                return;
        }
    }
}
