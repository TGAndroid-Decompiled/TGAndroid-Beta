package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39438a;
    public final k71 f39439b;

    public l51(k71 k71Var, int i10) {
        this.f39438a = i10;
        this.f39439b = k71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39438a) {
            case 0:
                k71 k71Var = this.f39439b;
                k71Var.getClass();
                k71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39439b.m();
                return;
            case 2:
                k71 k71Var2 = this.f39439b;
                View view = k71Var2.f39157t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, k71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = k71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.ao aoVar = k71Var2.f39143n0;
                if (aoVar != null) {
                    aoVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                k71 k71Var3 = this.f39439b;
                e61 e61Var = k71Var3.f39114a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = k71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.ao aoVar2 = k71Var3.f39143n0;
                if (aoVar2 != null) {
                    aoVar2.setAlpha(floatValue * floatValue);
                }
                e61Var.setAlpha(floatValue);
                e61Var.invalidate();
                k71Var3.invalidate();
                return;
        }
    }
}
