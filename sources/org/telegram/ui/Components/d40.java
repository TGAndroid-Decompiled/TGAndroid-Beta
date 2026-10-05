package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class d40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25617a;
    public final f40 f25618b;

    public d40(f40 f40Var, int i10) {
        this.f25617a = i10;
        this.f25618b = f40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.zn znVar;
        ai.w0 w0Var;
        switch (this.f25617a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var = this.f25618b;
                f40Var.f26318w = floatValue;
                f40Var.f26313e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                f40Var.f26313e.setPadding(0, 0, 0, (int) (f40Var.f26318w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var2 = this.f25618b;
                f40Var2.E = floatValue2;
                f40Var2.f26315n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                f40Var2.f26315n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.E));
                org.telegram.ui.fk fkVar = f40Var2.f26314f;
                if (fkVar != null && (znVar = fkVar.f34922a) != null && (w0Var = znVar.J3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                    f40Var2.f26314f.f34922a.J3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                }
                f40Var2.h.setAlpha(f40Var2.E);
                return;
        }
    }
}
