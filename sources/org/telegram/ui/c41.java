package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36243a;
    public final b61 f36244b;

    public c41(b61 b61Var, int i10) {
        this.f36243a = i10;
        this.f36244b = b61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36243a) {
            case 0:
                b61 b61Var = this.f36244b;
                b61Var.getClass();
                b61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f36244b.m();
                return;
            case 2:
                b61 b61Var2 = this.f36244b;
                View view = b61Var2.f35930t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, b61Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = b61Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.un unVar = b61Var2.f35916n0;
                if (unVar != null) {
                    unVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                b61 b61Var3 = this.f36244b;
                v41 v41Var = b61Var3.f35888a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = b61Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.un unVar2 = b61Var3.f35916n0;
                if (unVar2 != null) {
                    unVar2.setAlpha(floatValue * floatValue);
                }
                v41Var.setAlpha(floatValue);
                v41Var.invalidate();
                b61Var3.invalidate();
                return;
        }
    }
}
