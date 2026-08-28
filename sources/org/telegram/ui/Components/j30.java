package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29616a;
    public final l30 f29617b;

    public j30(l30 l30Var, int i9) {
        this.f29616a = i9;
        this.f29617b = l30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.rn rnVar;
        gh.f1 f1Var;
        switch (this.f29616a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l30 l30Var = this.f29617b;
                l30Var.f30316w = floatValue;
                l30Var.f30311e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                l30Var.f30311e.setPadding(0, 0, 0, (int) (l30Var.f30316w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l30 l30Var2 = this.f29617b;
                l30Var2.A = floatValue2;
                l30Var2.f30313n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                l30Var2.f30313n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l30Var2.A));
                org.telegram.ui.wj wjVar = l30Var2.f30312f;
                if (wjVar != null && (rnVar = wjVar.f42731a) != null && (f1Var = rnVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                    l30Var2.f30312f.f42731a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                }
                l30Var2.h.setAlpha(l30Var2.A);
                return;
        }
    }
}
