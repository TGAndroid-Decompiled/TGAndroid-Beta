package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24232a;
    public final l40 f24233b;

    public j40(l40 l40Var, int i10) {
        this.f24232a = i10;
        this.f24233b = l40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.fo foVar;
        bi.y1 y1Var;
        switch (this.f24232a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l40 l40Var = this.f24233b;
                l40Var.f24871w = floatValue;
                l40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                l40Var.e.setPadding(0, 0, 0, (int) (l40Var.f24871w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l40 l40Var2 = this.f24233b;
                l40Var2.E = floatValue2;
                l40Var2.f24868n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                l40Var2.f24868n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l40Var2.E));
                org.telegram.ui.kk kkVar = l40Var2.f24867f;
                if (kkVar != null && (foVar = kkVar.f33142a) != null && (y1Var = foVar.L3) != null) {
                    y1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                    l40Var2.f24867f.f33142a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                }
                l40Var2.h.setAlpha(l40Var2.E);
                return;
        }
    }
}
