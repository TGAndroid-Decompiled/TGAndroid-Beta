package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29990a;
    public final n3 f29991b;

    public l3(n3 n3Var, int i10) {
        this.f29990a = i10;
        this.f29991b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29990a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3 n3Var = this.f29991b;
                n3Var.f30021n = floatValue;
                n3Var.f30018k.invalidate();
                if (n3Var.f30021n > 1.0f && n3Var.f30025r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    n3Var.f30025r = ofInt;
                    ofInt.addUpdateListener(new l3(n3Var, 2));
                    n3Var.f30025r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    n3Var.f30025r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var2 = this.f29991b;
                n3Var2.f30020m = intValue;
                n3Var2.f30018k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var3 = this.f29991b;
                if (n3Var3.f30016i <= n3Var3.f30022o / 2) {
                    intValue2 = -intValue2;
                }
                n3Var3.f30023p = intValue2;
                n3Var3.f30018k.invalidate();
                return;
        }
    }
}
