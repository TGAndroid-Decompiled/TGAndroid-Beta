package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32657a;
    public final a71 f32658b;

    public c51(a71 a71Var, int i10) {
        this.f32657a = i10;
        this.f32658b = a71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32657a) {
            case 0:
                a71 a71Var = this.f32658b;
                a71Var.getClass();
                a71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f32658b.m();
                return;
            case 2:
                a71 a71Var2 = this.f32658b;
                View view = a71Var2.f32126t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, a71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = a71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.nn nnVar = a71Var2.f32112n0;
                if (nnVar != null) {
                    nnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                a71 a71Var3 = this.f32658b;
                u51 u51Var = a71Var3.f32084a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = a71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.nn nnVar2 = a71Var3.f32112n0;
                if (nnVar2 != null) {
                    nnVar2.setAlpha(floatValue * floatValue);
                }
                u51Var.setAlpha(floatValue);
                u51Var.invalidate();
                a71Var3.invalidate();
                return;
        }
    }
}
