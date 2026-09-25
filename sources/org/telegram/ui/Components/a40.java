package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class a40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22593a;
    public final c40 f22594b;

    public a40(c40 c40Var, int i10) {
        this.f22593a = i10;
        this.f22594b = c40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f22593a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var = this.f22594b;
                c40Var.f23189w = floatValue;
                c40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                c40Var.e.setPadding(0, 0, 0, (int) (c40Var.f23189w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var2 = this.f22594b;
                c40Var2.E = floatValue2;
                c40Var2.f23186n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                c40Var2.f23186n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, c40Var2.E));
                org.telegram.ui.fk fkVar = c40Var2.f23185f;
                if (fkVar != null && (xnVar = fkVar.f40194a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                    c40Var2.f23185f.f40194a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                }
                c40Var2.h.setAlpha(c40Var2.E);
                return;
        }
    }
}
