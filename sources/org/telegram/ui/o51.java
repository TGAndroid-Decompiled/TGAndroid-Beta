package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35399a;
    public final l71 f35400b;

    public o51(l71 l71Var, int i10) {
        this.f35399a = i10;
        this.f35400b = l71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35399a) {
            case 0:
                l71 l71Var = this.f35400b;
                l71Var.getClass();
                l71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f35400b.m();
                return;
            case 2:
                l71 l71Var2 = this.f35400b;
                View view = l71Var2.f34595t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, l71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = l71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.qn qnVar = l71Var2.f34581n0;
                if (qnVar != null) {
                    qnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                l71 l71Var3 = this.f35400b;
                f61 f61Var = l71Var3.f34553a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = l71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.qn qnVar2 = l71Var3.f34581n0;
                if (qnVar2 != null) {
                    qnVar2.setAlpha(floatValue * floatValue);
                }
                f61Var.setAlpha(floatValue);
                f61Var.invalidate();
                l71Var3.invalidate();
                return;
        }
    }
}
