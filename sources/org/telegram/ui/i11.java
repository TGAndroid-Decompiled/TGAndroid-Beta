package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class i11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37925a;
    public final g31 f37926b;

    public i11(g31 g31Var, int i10) {
        this.f37925a = i10;
        this.f37926b = g31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37925a) {
            case 0:
                g31 g31Var = this.f37926b;
                g31Var.getClass();
                g31Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37926b.m();
                return;
            case 2:
                g31 g31Var2 = this.f37926b;
                View view = g31Var2.f37330t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, g31Var2.Z0), i0.b.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = g31Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.bn bnVar = g31Var2.f37316n0;
                if (bnVar != null) {
                    bnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                g31 g31Var3 = this.f37926b;
                b21 b21Var = g31Var3.f37288a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.i0.L(8.0f));
                View view3 = g31Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.bn bnVar2 = g31Var3.f37316n0;
                if (bnVar2 != null) {
                    bnVar2.setAlpha(floatValue * floatValue);
                }
                b21Var.setAlpha(floatValue);
                b21Var.invalidate();
                g31Var3.invalidate();
                return;
        }
    }
}
