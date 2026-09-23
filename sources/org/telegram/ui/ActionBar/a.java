package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18411a;
    public final k f18412b;

    public a(k kVar, int i10) {
        this.f18411a = i10;
        this.f18412b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f18411a) {
            case 0:
                xz0 xz0Var = this.f18412b.U0;
                if (xz0Var != null) {
                    xz0Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f18412b;
                kVar.f19298o0 = floatValue;
                if (kVar.f19267a != null && kVar.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f19298o0);
                    kVar.f19267a.r(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.O0 && (zVar = kVar.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f19298o0));
                }
                xz0 xz0Var2 = kVar.U0;
                if (xz0Var2 != null) {
                    xz0Var2.run();
                    return;
                }
                return;
            case 2:
                xz0 xz0Var3 = this.f18412b.U0;
                if (xz0Var3 != null) {
                    xz0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f18412b;
                kVar2.getClass();
                kVar2.f19306r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f18412b;
                kVar3.getClass();
                kVar3.f19306r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
