package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40559a;
    public final n71 f40560b;

    public o51(n71 n71Var, int i10) {
        this.f40559a = i10;
        this.f40560b = n71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40559a) {
            case 0:
                n71 n71Var = this.f40560b;
                n71Var.getClass();
                n71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40560b.m();
                return;
            case 2:
                n71 n71Var2 = this.f40560b;
                View view = n71Var2.f40297t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, n71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = n71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.co coVar = n71Var2.f40283n0;
                if (coVar != null) {
                    coVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                n71 n71Var3 = this.f40560b;
                h61 h61Var = n71Var3.f40254a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = n71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.co coVar2 = n71Var3.f40283n0;
                if (coVar2 != null) {
                    coVar2.setAlpha(floatValue * floatValue);
                }
                h61Var.setAlpha(floatValue);
                h61Var.invalidate();
                n71Var3.invalidate();
                return;
        }
    }
}
