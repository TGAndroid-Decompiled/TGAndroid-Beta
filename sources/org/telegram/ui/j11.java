package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class j11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38415a;
    public final i31 f38416b;

    public j11(i31 i31Var, int i10) {
        this.f38415a = i10;
        this.f38416b = i31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38415a) {
            case 0:
                i31 i31Var = this.f38416b;
                i31Var.getClass();
                i31Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38416b.m();
                return;
            case 2:
                i31 i31Var2 = this.f38416b;
                View view = i31Var2.f38154t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, i31Var2.Z0), i0.b.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = i31Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.bn bnVar = i31Var2.f38140n0;
                if (bnVar != null) {
                    bnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                i31 i31Var3 = this.f38416b;
                d21 d21Var = i31Var3.f38112a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i31Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.i0.L(8.0f));
                View view3 = i31Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.bn bnVar2 = i31Var3.f38140n0;
                if (bnVar2 != null) {
                    bnVar2.setAlpha(floatValue * floatValue);
                }
                d21Var.setAlpha(floatValue);
                d21Var.invalidate();
                i31Var3.invalidate();
                return;
        }
    }
}
