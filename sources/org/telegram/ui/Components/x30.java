package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34564a;
    public final z30 f34565b;

    public x30(z30 z30Var, int i10) {
        this.f34564a = i10;
        this.f34565b = z30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.un unVar;
        jh.e1 e1Var;
        switch (this.f34564a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z30 z30Var = this.f34565b;
                z30Var.f35197w = floatValue;
                z30Var.f35192e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                z30Var.f35192e.setPadding(0, 0, 0, (int) (z30Var.f35197w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z30 z30Var2 = this.f34565b;
                z30Var2.A = floatValue2;
                z30Var2.f35194n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                z30Var2.f35194n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, z30Var2.A));
                org.telegram.ui.zj zjVar = z30Var2.f35193f;
                if (zjVar != null && (unVar = zjVar.f43683a) != null && (e1Var = unVar.H3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                    z30Var2.f35193f.f43683a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                }
                z30Var2.h.setAlpha(z30Var2.A);
                return;
        }
    }
}
