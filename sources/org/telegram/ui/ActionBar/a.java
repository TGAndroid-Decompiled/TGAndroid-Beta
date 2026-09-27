package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xz0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18657a;
    public final l f18658b;

    public a(l lVar, int i10) {
        this.f18657a = i10;
        this.f18658b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a0 a0Var;
        switch (this.f18657a) {
            case 0:
                l lVar = this.f18658b;
                lVar.getClass();
                lVar.f19592w1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.b();
                return;
            case 1:
                xz0 xz0Var = this.f18658b.X0;
                if (xz0Var != null) {
                    xz0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar2 = this.f18658b;
                lVar2.f19572o0 = floatValue;
                if (lVar2.f19541a != null && lVar2.S0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), lVar2.f19572o0);
                    lVar2.f19541a.x(lerp, dp, dp, lerp);
                    lVar2.invalidate();
                }
                if (lVar2.Q0 && (a0Var = lVar2.E) != null) {
                    a0Var.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), lVar2.f19572o0));
                }
                xz0 xz0Var2 = lVar2.X0;
                if (xz0Var2 != null) {
                    xz0Var2.run();
                    return;
                }
                return;
            case 3:
                xz0 xz0Var3 = this.f18658b.X0;
                if (xz0Var3 != null) {
                    xz0Var3.run();
                    return;
                }
                return;
            default:
                l lVar3 = this.f18658b;
                lVar3.getClass();
                lVar3.f19592w1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.b();
                return;
        }
    }
}
