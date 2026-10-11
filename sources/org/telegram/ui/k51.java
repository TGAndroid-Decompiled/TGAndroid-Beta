package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39209a;
    public final j71 f39210b;

    public k51(j71 j71Var, int i10) {
        this.f39209a = i10;
        this.f39210b = j71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39209a) {
            case 0:
                j71 j71Var = this.f39210b;
                j71Var.getClass();
                j71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39210b.m();
                return;
            case 2:
                j71 j71Var2 = this.f39210b;
                View view = j71Var2.f38919t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, j71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = j71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.ao aoVar = j71Var2.f38905n0;
                if (aoVar != null) {
                    aoVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                j71 j71Var3 = this.f39210b;
                d61 d61Var = j71Var3.f38876a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = j71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.ao aoVar2 = j71Var3.f38905n0;
                if (aoVar2 != null) {
                    aoVar2.setAlpha(floatValue * floatValue);
                }
                d61Var.setAlpha(floatValue);
                d61Var.invalidate();
                j71Var3.invalidate();
                return;
        }
    }
}
