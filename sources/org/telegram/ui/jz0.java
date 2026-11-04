package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class jz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46714a;
    public final g11 f46715b;

    public jz0(g11 g11Var, int i3) {
        this.f46714a = i3;
        this.f46715b = g11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46714a) {
            case 0:
                g11 g11Var = this.f46715b;
                g11Var.getClass();
                g11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f46715b.m();
                return;
            case 2:
                g11 g11Var2 = this.f46715b;
                View view = g11Var2.f45480u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, g11Var2.f45436a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = g11Var2.f45464n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.sm smVar = g11Var2.f45466o0;
                if (smVar != null) {
                    smVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                g11 g11Var3 = this.f46715b;
                b01 b01Var = g11Var3.f45439b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = g11Var3.f45464n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.sm smVar2 = g11Var3.f45466o0;
                if (smVar2 != null) {
                    smVar2.setAlpha(floatValue * floatValue);
                }
                b01Var.setAlpha(floatValue);
                b01Var.invalidate();
                g11Var3.invalidate();
                return;
        }
    }
}
