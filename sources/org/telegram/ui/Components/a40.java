package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class a40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22355a;
    public final c40 f22356b;

    public a40(c40 c40Var, int i10) {
        this.f22355a = i10;
        this.f22356b = c40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.yn ynVar;
        ai.w0 w0Var;
        switch (this.f22355a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var = this.f22356b;
                c40Var.f22919w = floatValue;
                c40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                c40Var.e.setPadding(0, 0, 0, (int) (c40Var.f22919w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var2 = this.f22356b;
                c40Var2.E = floatValue2;
                c40Var2.f22916n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                c40Var2.f22916n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, c40Var2.E));
                org.telegram.ui.fk fkVar = c40Var2.f22915f;
                if (fkVar != null && (ynVar = fkVar.f40196a) != null && (w0Var = ynVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                    c40Var2.f22915f.f40196a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                }
                c40Var2.h.setAlpha(c40Var2.E);
                return;
        }
    }
}
