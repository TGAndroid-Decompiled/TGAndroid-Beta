package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class l3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33713a;

    public final n3 f33714b;

    public l3(n3 n3Var, int i10) {
        this.f33713a = i10;
        this.f33714b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33713a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3 n3Var = this.f33714b;
                n3Var.f33760n = fFloatValue;
                n3Var.f33757k.invalidate();
                if (n3Var.f33760n > 1.0f && n3Var.f33764r == null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    n3Var.f33764r = valueAnimatorOfInt;
                    valueAnimatorOfInt.addUpdateListener(new l3(n3Var, 2));
                    n3Var.f33764r.setDuration(((long) 350) - valueAnimator.getCurrentPlayTime());
                    n3Var.f33764r.start();
                    break;
                }
                break;
            case 1:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var2 = this.f33714b;
                n3Var2.f33759m = iIntValue;
                n3Var2.f33757k.invalidate();
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n3 n3Var3 = this.f33714b;
                if (n3Var3.f33755i <= n3Var3.f33761o / 2) {
                    iIntValue2 = -iIntValue2;
                }
                n3Var3.f33762p = iIntValue2;
                n3Var3.f33757k.invalidate();
                break;
        }
    }
}
