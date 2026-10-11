package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20370a;
    public final k f20371b;

    public a(k kVar, int i10) {
        this.f20370a = i10;
        this.f20371b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f20370a) {
            case 0:
                k kVar = this.f20371b;
                kVar.getClass();
                kVar.f21299s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                mz0 mz0Var = this.f20371b.U0;
                if (mz0Var != null) {
                    mz0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f20371b;
                kVar2.f21288o0 = floatValue;
                if (kVar2.f21256a != null && kVar2.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f21288o0);
                    kVar2.f21256a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.O0 && (yVar = kVar2.E) != null) {
                    yVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f21288o0));
                }
                mz0 mz0Var2 = kVar2.U0;
                if (mz0Var2 != null) {
                    mz0Var2.run();
                    return;
                }
                return;
            case 3:
                mz0 mz0Var3 = this.f20371b.U0;
                if (mz0Var3 != null) {
                    mz0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f20371b;
                kVar3.getClass();
                kVar3.f21299s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
