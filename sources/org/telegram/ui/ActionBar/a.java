package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f19250a;
    public final k f19251b;

    public a(k kVar, int i10) {
        this.f19250a = i10;
        this.f19251b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f19250a) {
            case 0:
                k kVar = this.f19251b;
                kVar.getClass();
                kVar.f20155s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                tz0 tz0Var = this.f19251b.U0;
                if (tz0Var != null) {
                    tz0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f19251b;
                kVar2.f20144o0 = floatValue;
                if (kVar2.f20113a != null && kVar2.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f20144o0);
                    kVar2.f20113a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.O0 && (yVar = kVar2.E) != null) {
                    yVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f20144o0));
                }
                tz0 tz0Var2 = kVar2.U0;
                if (tz0Var2 != null) {
                    tz0Var2.run();
                    return;
                }
                return;
            case 3:
                tz0 tz0Var3 = this.f19251b.U0;
                if (tz0Var3 != null) {
                    tz0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f19251b;
                kVar3.getClass();
                kVar3.f20155s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
