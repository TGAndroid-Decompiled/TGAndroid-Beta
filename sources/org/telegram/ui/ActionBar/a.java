package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vy0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f19505a;
    public final k f19506b;

    public a(k kVar, int i10) {
        this.f19505a = i10;
        this.f19506b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f19505a) {
            case 0:
                vy0 vy0Var = this.f19506b.R0;
                if (vy0Var != null) {
                    vy0Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f19506b;
                kVar.f20332l0 = floatValue;
                if (kVar.f20306a != null && kVar.N0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f20332l0);
                    kVar.f20306a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.L0 && (zVar = kVar.B) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f20332l0));
                }
                vy0 vy0Var2 = kVar.R0;
                if (vy0Var2 != null) {
                    vy0Var2.run();
                    return;
                }
                return;
            case 2:
                vy0 vy0Var3 = this.f19506b.R0;
                if (vy0Var3 != null) {
                    vy0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f19506b;
                kVar2.getClass();
                kVar2.f20338o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f19506b;
                kVar3.getClass();
                kVar3.f20338o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
