package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.sy0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20603a;
    public final k f20604b;

    public a(k kVar, int i10) {
        this.f20603a = i10;
        this.f20604b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f20603a) {
            case 0:
                k kVar = this.f20604b;
                kVar.getClass();
                kVar.f21506s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                sy0 sy0Var = this.f20604b.U0;
                if (sy0Var != null) {
                    sy0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f20604b;
                kVar2.f21495o0 = floatValue;
                if (kVar2.f21464a != null && kVar2.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f21495o0);
                    kVar2.f21464a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.O0 && (yVar = kVar2.E) != null) {
                    yVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f21495o0));
                }
                sy0 sy0Var2 = kVar2.U0;
                if (sy0Var2 != null) {
                    sy0Var2.run();
                    return;
                }
                return;
            case 3:
                sy0 sy0Var3 = this.f20604b.U0;
                if (sy0Var3 != null) {
                    sy0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f20604b;
                kVar3.getClass();
                kVar3.f21506s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
