package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23556a;
    public final d40 f23557b;

    public b40(d40 d40Var, int i10) {
        this.f23556a = i10;
        this.f23557b = d40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.yn ynVar;
        lh.e1 e1Var;
        switch (this.f23556a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d40 d40Var = this.f23557b;
                d40Var.f24153w = floatValue;
                d40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                d40Var.e.setPadding(0, 0, 0, (int) (d40Var.f24153w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d40 d40Var2 = this.f23557b;
                d40Var2.B = floatValue2;
                d40Var2.f24150n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                d40Var2.f24150n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, d40Var2.B));
                org.telegram.ui.fk fkVar = d40Var2.f24149f;
                if (fkVar != null && (ynVar = fkVar.f40837a) != null && (e1Var = ynVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                    d40Var2.f24149f.f40837a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                }
                d40Var2.h.setAlpha(d40Var2.B);
                return;
        }
    }
}
