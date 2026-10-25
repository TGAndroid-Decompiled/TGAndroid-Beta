package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38730a;
    public final c61 f38731b;

    public d41(c61 c61Var, int i10) {
        this.f38730a = i10;
        this.f38731b = c61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38730a) {
            case 0:
                c61 c61Var = this.f38731b;
                c61Var.getClass();
                c61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38731b.m();
                return;
            case 2:
                c61 c61Var2 = this.f38731b;
                View view = c61Var2.f38321t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, c61Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = c61Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.vn vnVar = c61Var2.f38307n0;
                if (vnVar != null) {
                    vnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                c61 c61Var3 = this.f38731b;
                w41 w41Var = c61Var3.f38279a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = c61Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.vn vnVar2 = c61Var3.f38307n0;
                if (vnVar2 != null) {
                    vnVar2.setAlpha(floatValue * floatValue);
                }
                w41Var.setAlpha(floatValue);
                w41Var.invalidate();
                c61Var3.invalidate();
                return;
        }
    }
}
