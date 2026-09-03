package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26181a;
    public final f40 f26182b;

    public d40(f40 f40Var, int i10) {
        this.f26181a = i10;
        this.f26182b = f40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.yn ynVar;
        mh.d1 d1Var;
        switch (this.f26181a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var = this.f26182b;
                f40Var.f26768w = floatValue;
                f40Var.f26763e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                f40Var.f26763e.setPadding(0, 0, 0, (int) (f40Var.f26768w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var2 = this.f26182b;
                f40Var2.B = floatValue2;
                f40Var2.f26765n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                f40Var2.f26765n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.B));
                org.telegram.ui.fk fkVar = f40Var2.f26764f;
                if (fkVar != null && (ynVar = fkVar.f43986a) != null && (d1Var = ynVar.I3) != null) {
                    d1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                    f40Var2.f26764f.f43986a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                }
                f40Var2.h.setAlpha(f40Var2.B);
                return;
        }
    }
}
