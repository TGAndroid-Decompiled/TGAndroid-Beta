package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.nz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20376a;
    public final k f20377b;

    public a(k kVar, int i10) {
        this.f20376a = i10;
        this.f20377b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f20376a) {
            case 0:
                k kVar = this.f20377b;
                kVar.getClass();
                kVar.f21298s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                nz0 nz0Var = this.f20377b.U0;
                if (nz0Var != null) {
                    nz0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f20377b;
                kVar2.f21287o0 = floatValue;
                if (kVar2.f21255a != null && kVar2.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f21287o0);
                    kVar2.f21255a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.O0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f21287o0));
                }
                nz0 nz0Var2 = kVar2.U0;
                if (nz0Var2 != null) {
                    nz0Var2.run();
                    return;
                }
                return;
            case 3:
                nz0 nz0Var3 = this.f20377b.U0;
                if (nz0Var3 != null) {
                    nz0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f20377b;
                kVar3.getClass();
                kVar3.f21298s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
