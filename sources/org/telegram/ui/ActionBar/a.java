package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ky0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f22704a;
    public final k f22705b;

    public a(k kVar, int i9) {
        this.f22704a = i9;
        this.f22705b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f22704a) {
            case 0:
                ky0 ky0Var = this.f22705b.Q0;
                if (ky0Var != null) {
                    ky0Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f22705b;
                kVar.f23579k0 = floatValue;
                if (kVar.f23554a != null && kVar.M0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f23579k0);
                    kVar.f23554a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.K0 && (zVar = kVar.A) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f23579k0));
                }
                ky0 ky0Var2 = kVar.Q0;
                if (ky0Var2 != null) {
                    ky0Var2.run();
                    return;
                }
                return;
            case 2:
                ky0 ky0Var3 = this.f22705b.Q0;
                if (ky0Var3 != null) {
                    ky0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f22705b;
                kVar2.getClass();
                kVar2.f23585n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f22705b;
                kVar3.getClass();
                kVar3.f23585n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
