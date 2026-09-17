package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33101a;
    public final b40 f33102b;

    public z30(b40 b40Var, int i10) {
        this.f33101a = i10;
        this.f33102b = b40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.eo eoVar;
        bi.o0 o0Var;
        switch (this.f33101a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b40 b40Var = this.f33102b;
                b40Var.f24571w = floatValue;
                b40Var.f24566e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                b40Var.f24566e.setPadding(0, 0, 0, (int) (b40Var.f24571w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b40 b40Var2 = this.f33102b;
                b40Var2.E = floatValue2;
                b40Var2.f24568n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                b40Var2.f24568n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f24567f;
                if (ikVar != null && (eoVar = ikVar.f36465a) != null && (o0Var = eoVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f24567f.f36465a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                }
                b40Var2.h.setAlpha(b40Var2.E);
                return;
        }
    }
}
