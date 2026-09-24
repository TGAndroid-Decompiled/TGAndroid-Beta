package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class a40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22578a;
    public final c40 f22579b;

    public a40(c40 c40Var, int i10) {
        this.f22578a = i10;
        this.f22579b = c40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f22578a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var = this.f22579b;
                c40Var.f23159w = floatValue;
                c40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                c40Var.e.setPadding(0, 0, 0, (int) (c40Var.f23159w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var2 = this.f22579b;
                c40Var2.E = floatValue2;
                c40Var2.f23156n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                c40Var2.f23156n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, c40Var2.E));
                org.telegram.ui.fk fkVar = c40Var2.f23155f;
                if (fkVar != null && (xnVar = fkVar.f40177a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                    c40Var2.f23155f.f40177a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                }
                c40Var2.h.setAlpha(c40Var2.E);
                return;
        }
    }
}
