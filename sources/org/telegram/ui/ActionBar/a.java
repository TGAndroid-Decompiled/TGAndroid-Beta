package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ky0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f22716a;
    public final l f22717b;

    public a(l lVar, int i10) {
        this.f22716a = i10;
        this.f22717b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a0 a0Var;
        switch (this.f22716a) {
            case 0:
                ky0 ky0Var = this.f22717b.Q0;
                if (ky0Var != null) {
                    ky0Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f22717b;
                lVar.f23614k0 = floatValue;
                if (lVar.f23589a != null && lVar.M0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), lVar.f23614k0);
                    lVar.f23589a.q(lerp, dp, dp, lerp);
                    lVar.invalidate();
                }
                if (lVar.K0 && (a0Var = lVar.A) != null) {
                    a0Var.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), lVar.f23614k0));
                }
                ky0 ky0Var2 = lVar.Q0;
                if (ky0Var2 != null) {
                    ky0Var2.run();
                    return;
                }
                return;
            case 2:
                ky0 ky0Var3 = this.f22717b.Q0;
                if (ky0Var3 != null) {
                    ky0Var3.run();
                    return;
                }
                return;
            case 3:
                l lVar2 = this.f22717b;
                lVar2.getClass();
                lVar2.f23620n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.b();
                return;
            default:
                l lVar3 = this.f22717b;
                lVar3.getClass();
                lVar3.f23620n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.b();
                return;
        }
    }
}
