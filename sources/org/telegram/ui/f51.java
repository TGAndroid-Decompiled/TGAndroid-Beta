package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36190a;
    public final c71 f36191b;

    public f51(c71 c71Var, int i10) {
        this.f36190a = i10;
        this.f36191b = c71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36190a) {
            case 0:
                c71 c71Var = this.f36191b;
                c71Var.getClass();
                c71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36191b.m();
                return;
            case 2:
                c71 c71Var2 = this.f36191b;
                View view = c71Var2.f35340t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, c71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = c71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.nn nnVar = c71Var2.f35326n0;
                if (nnVar != null) {
                    nnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                c71 c71Var3 = this.f36191b;
                w51 w51Var = c71Var3.f35297a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = c71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.nn nnVar2 = c71Var3.f35326n0;
                if (nnVar2 != null) {
                    nnVar2.setAlpha(floatValue * floatValue);
                }
                w51Var.setAlpha(floatValue);
                w51Var.invalidate();
                c71Var3.invalidate();
                return;
        }
    }
}
