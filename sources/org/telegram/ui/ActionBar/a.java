package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.k01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f17530a;
    public final l f17531b;

    public a(l lVar, int i10) {
        this.f17530a = i10;
        this.f17531b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f17530a) {
            case 0:
                k01 k01Var = this.f17531b.U0;
                if (k01Var != null) {
                    k01Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f17531b;
                lVar.f18391o0 = floatValue;
                if (lVar.f18360a != null && lVar.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), lVar.f18391o0);
                    lVar.f18360a.q(lerp, dp, dp, lerp);
                    lVar.invalidate();
                }
                if (lVar.O0 && (zVar = lVar.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), lVar.f18391o0));
                }
                k01 k01Var2 = lVar.U0;
                if (k01Var2 != null) {
                    k01Var2.run();
                    return;
                }
                return;
            case 2:
                k01 k01Var3 = this.f17531b.U0;
                if (k01Var3 != null) {
                    k01Var3.run();
                    return;
                }
                return;
            case 3:
                l lVar2 = this.f17531b;
                lVar2.getClass();
                lVar2.f18399r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.b();
                return;
            default:
                l lVar3 = this.f17531b;
                lVar3.getClass();
                lVar3.f18399r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.b();
                return;
        }
    }
}
