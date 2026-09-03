package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.sz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f19480a;
    public final k f19481b;

    public a(k kVar, int i10) {
        this.f19480a = i10;
        this.f19481b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f19480a) {
            case 0:
                sz0 sz0Var = this.f19481b.R0;
                if (sz0Var != null) {
                    sz0Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f19481b;
                kVar.f20307l0 = floatValue;
                if (kVar.f20281a != null && kVar.N0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f20307l0);
                    kVar.f20281a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.L0 && (zVar = kVar.B) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f20307l0));
                }
                sz0 sz0Var2 = kVar.R0;
                if (sz0Var2 != null) {
                    sz0Var2.run();
                    return;
                }
                return;
            case 2:
                sz0 sz0Var3 = this.f19481b.R0;
                if (sz0Var3 != null) {
                    sz0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f19481b;
                kVar2.getClass();
                kVar2.f20313o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f19481b;
                kVar3.getClass();
                kVar3.f20313o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
