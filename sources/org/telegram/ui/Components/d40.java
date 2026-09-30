package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23517a;
    public final f40 f23518b;

    public d40(f40 f40Var, int i10) {
        this.f23517a = i10;
        this.f23518b = f40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f23517a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var = this.f23518b;
                f40Var.f24161w = floatValue;
                f40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                f40Var.e.setPadding(0, 0, 0, (int) (f40Var.f24161w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var2 = this.f23518b;
                f40Var2.E = floatValue2;
                f40Var2.f24158n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                f40Var2.f24158n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.E));
                org.telegram.ui.fk fkVar = f40Var2.f24157f;
                if (fkVar != null && (xnVar = fkVar.f40301a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                    f40Var2.f24157f.f40301a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                }
                f40Var2.h.setAlpha(f40Var2.E);
                return;
        }
    }
}
