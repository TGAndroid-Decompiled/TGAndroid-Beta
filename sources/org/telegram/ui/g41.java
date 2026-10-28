package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39498a;
    public final f61 f39499b;

    public g41(f61 f61Var, int i10) {
        this.f39498a = i10;
        this.f39499b = f61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39498a) {
            case 0:
                f61 f61Var = this.f39499b;
                f61Var.getClass();
                f61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39499b.m();
                return;
            case 2:
                f61 f61Var2 = this.f39499b;
                View view = f61Var2.f39227t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, f61Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = f61Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.vn vnVar = f61Var2.f39213n0;
                if (vnVar != null) {
                    vnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                f61 f61Var3 = this.f39499b;
                z41 z41Var = f61Var3.f39185a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = f61Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.vn vnVar2 = f61Var3.f39213n0;
                if (vnVar2 != null) {
                    vnVar2.setAlpha(floatValue * floatValue);
                }
                z41Var.setAlpha(floatValue);
                z41Var.invalidate();
                f61Var3.invalidate();
                return;
        }
    }
}
