package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26918a;
    public final o40 f26919b;

    public m40(o40 o40Var, int i10) {
        this.f26918a = i10;
        this.f26919b = o40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.go goVar;
        bi.o0 o0Var;
        switch (this.f26918a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o40 o40Var = this.f26919b;
                o40Var.f27535w = floatValue;
                o40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                o40Var.e.setPadding(0, 0, 0, (int) (o40Var.f27535w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o40 o40Var2 = this.f26919b;
                o40Var2.E = floatValue2;
                o40Var2.f27532n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                o40Var2.f27532n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, o40Var2.E));
                org.telegram.ui.nk nkVar = o40Var2.f27531f;
                if (nkVar != null && (goVar = nkVar.f36617a) != null && (o0Var = goVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, o40Var2.E));
                    o40Var2.f27531f.f36617a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, o40Var2.E));
                }
                o40Var2.h.setAlpha(o40Var2.E);
                return;
        }
    }
}
