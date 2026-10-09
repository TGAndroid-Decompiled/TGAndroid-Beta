package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class q40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30037a;
    public final s40 f30038b;

    public q40(s40 s40Var, int i10) {
        this.f30037a = i10;
        this.f30038b = s40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.f30037a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s40 s40Var = this.f30038b;
                s40Var.f30635w = floatValue;
                s40Var.f30630e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                s40Var.f30630e.setPadding(0, 0, 0, (int) (s40Var.f30635w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s40 s40Var2 = this.f30038b;
                s40Var2.E = floatValue2;
                s40Var2.f30632n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                s40Var2.f30632n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, s40Var2.E));
                org.telegram.ui.jk jkVar = s40Var2.f30631f;
                if (jkVar != null && (aoVar = jkVar.f36357a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                    s40Var2.f30631f.f36357a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                }
                s40Var2.h.setAlpha(s40Var2.E);
                return;
        }
    }
}
