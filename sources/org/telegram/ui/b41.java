package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35918a;
    public final a61 f35919b;

    public b41(a61 a61Var, int i10) {
        this.f35918a = i10;
        this.f35919b = a61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35918a) {
            case 0:
                a61 a61Var = this.f35919b;
                a61Var.getClass();
                a61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f35919b.m();
                return;
            case 2:
                a61 a61Var2 = this.f35919b;
                View view = a61Var2.f35647t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, a61Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = a61Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.sn snVar = a61Var2.f35633n0;
                if (snVar != null) {
                    snVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                a61 a61Var3 = this.f35919b;
                u41 u41Var = a61Var3.f35605a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = a61Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.sn snVar2 = a61Var3.f35633n0;
                if (snVar2 != null) {
                    snVar2.setAlpha(floatValue * floatValue);
                }
                u41Var.setAlpha(floatValue);
                u41Var.invalidate();
                a61Var3.invalidate();
                return;
        }
    }
}
