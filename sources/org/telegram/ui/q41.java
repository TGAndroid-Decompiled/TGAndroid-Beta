package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37587a;
    public final q61 f37588b;

    public q41(q61 q61Var, int i10) {
        this.f37587a = i10;
        this.f37588b = q61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37587a) {
            case 0:
                q61 q61Var = this.f37588b;
                q61Var.getClass();
                q61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37588b.m();
                return;
            case 2:
                q61 q61Var2 = this.f37588b;
                View view = q61Var2.f37629q0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, q61Var2.W0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = q61Var2.f37616j0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.hn hnVar = q61Var2.f37618k0;
                if (hnVar != null) {
                    hnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                q61 q61Var3 = this.f37588b;
                j51 j51Var = q61Var3.U;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = q61Var3.f37616j0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.hn hnVar2 = q61Var3.f37618k0;
                if (hnVar2 != null) {
                    hnVar2.setAlpha(floatValue * floatValue);
                }
                j51Var.setAlpha(floatValue);
                j51Var.invalidate();
                q61Var3.invalidate();
                return;
        }
    }
}
