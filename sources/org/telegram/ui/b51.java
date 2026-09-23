package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31967a;
    public final z61 f31968b;

    public b51(z61 z61Var, int i10) {
        this.f31967a = i10;
        this.f31968b = z61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31967a) {
            case 0:
                z61 z61Var = this.f31968b;
                z61Var.getClass();
                z61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f31968b.m();
                return;
            case 2:
                z61 z61Var2 = this.f31968b;
                View view = z61Var2.f40046t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, z61Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = z61Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.ln lnVar = z61Var2.f40032n0;
                if (lnVar != null) {
                    lnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                z61 z61Var3 = this.f31968b;
                t51 t51Var = z61Var3.f40004a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = z61Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.ln lnVar2 = z61Var3.f40032n0;
                if (lnVar2 != null) {
                    lnVar2.setAlpha(floatValue * floatValue);
                }
                t51Var.setAlpha(floatValue);
                t51Var.invalidate();
                z61Var3.invalidate();
                return;
        }
    }
}
