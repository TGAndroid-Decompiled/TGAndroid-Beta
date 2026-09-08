package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.f01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20227a;
    public final k f20228b;

    public a(k kVar, int i10) {
        this.f20227a = i10;
        this.f20228b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f20227a) {
            case 0:
                f01 f01Var = this.f20228b.U0;
                if (f01Var != null) {
                    f01Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f20228b;
                kVar.f21132o0 = floatValue;
                if (kVar.f21100a != null && kVar.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f21132o0);
                    kVar.f21100a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.O0 && (zVar = kVar.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f21132o0));
                }
                f01 f01Var2 = kVar.U0;
                if (f01Var2 != null) {
                    f01Var2.run();
                    return;
                }
                return;
            case 2:
                f01 f01Var3 = this.f20228b.U0;
                if (f01Var3 != null) {
                    f01Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f20228b;
                kVar2.getClass();
                kVar2.f21140r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f20228b;
                kVar3.getClass();
                kVar3.f21140r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
