package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18680a;
    public final k f18681b;

    public a(k kVar, int i10) {
        this.f18680a = i10;
        this.f18681b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f18680a) {
            case 0:
                k kVar = this.f18681b;
                kVar.getClass();
                kVar.f19582r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                vz0 vz0Var = this.f18681b.U0;
                if (vz0Var != null) {
                    vz0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f18681b;
                kVar2.f19574o0 = floatValue;
                if (kVar2.f19543a != null && kVar2.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f19574o0);
                    kVar2.f19543a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.O0 && (yVar = kVar2.E) != null) {
                    yVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f19574o0));
                }
                vz0 vz0Var2 = kVar2.U0;
                if (vz0Var2 != null) {
                    vz0Var2.run();
                    return;
                }
                return;
            case 3:
                vz0 vz0Var3 = this.f18681b.U0;
                if (vz0Var3 != null) {
                    vz0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f18681b;
                kVar3.getClass();
                kVar3.f19582r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
