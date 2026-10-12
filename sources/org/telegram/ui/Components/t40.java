package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30763a;
    public final v40 f30764b;

    public t40(v40 v40Var, int i10) {
        this.f30763a = i10;
        this.f30764b = v40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.fo foVar;
        ai.w0 w0Var;
        switch (this.f30763a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v40 v40Var = this.f30764b;
                v40Var.f31391w = floatValue;
                v40Var.f31386e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                v40Var.f31386e.setPadding(0, 0, 0, (int) (v40Var.f31391w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v40 v40Var2 = this.f30764b;
                v40Var2.E = floatValue2;
                v40Var2.f31388n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                v40Var2.f31388n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, v40Var2.E));
                org.telegram.ui.nk nkVar = v40Var2.f31387f;
                if (nkVar != null && (foVar = nkVar.f38109a) != null && (w0Var = foVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, v40Var2.E));
                    v40Var2.f31387f.f38109a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, v40Var2.E));
                }
                v40Var2.h.setAlpha(v40Var2.E);
                return;
        }
    }
}
