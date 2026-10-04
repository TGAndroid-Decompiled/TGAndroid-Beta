package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20369a;
    public final k f20370b;

    public a(k kVar, int i10) {
        this.f20369a = i10;
        this.f20370b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f20369a) {
            case 0:
                k kVar = this.f20370b;
                kVar.getClass();
                kVar.f21293u1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                hz0 hz0Var = this.f20370b.W0;
                if (hz0Var != null) {
                    hz0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f20370b;
                kVar2.f21278o0 = floatValue;
                if (kVar2.f21246a != null && kVar2.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f21278o0);
                    kVar2.f21246a.A(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.P0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f21278o0));
                }
                hz0 hz0Var2 = kVar2.W0;
                if (hz0Var2 != null) {
                    hz0Var2.run();
                    return;
                }
                return;
            case 3:
                hz0 hz0Var3 = this.f20370b.W0;
                if (hz0Var3 != null) {
                    hz0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f20370b;
                kVar3.getClass();
                kVar3.f21293u1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
