package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34407a;
    public final g71 f34408b;

    public i51(g71 g71Var, int i10) {
        this.f34407a = i10;
        this.f34408b = g71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34407a) {
            case 0:
                g71 g71Var = this.f34408b;
                g71Var.getClass();
                g71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f34408b.m();
                return;
            case 2:
                g71 g71Var2 = this.f34408b;
                View view = g71Var2.f33821t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, g71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = g71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.kn knVar = g71Var2.f33807n0;
                if (knVar != null) {
                    knVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                g71 g71Var3 = this.f34408b;
                a61 a61Var = g71Var3.f33779a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = g71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.kn knVar2 = g71Var3.f33807n0;
                if (knVar2 != null) {
                    knVar2.setAlpha(floatValue * floatValue);
                }
                a61Var.setAlpha(floatValue);
                a61Var.invalidate();
                g71Var3.invalidate();
                return;
        }
    }
}
