package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class d41 implements ValueAnimator.AnimatorUpdateListener {

    public final int f37255a;

    public final a61 f37256b;

    public d41(a61 a61Var, int i10) {
        this.f37255a = i10;
        this.f37256b = a61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37255a) {
            case 0:
                a61 a61Var = this.f37256b;
                a61Var.getClass();
                a61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.f37256b.m();
                break;
            case 2:
                a61 a61Var2 = this.f37256b;
                View view = a61Var2.f36417p0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int iV = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, a61Var2.V0), i0.b.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = a61Var2.f36404i0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(iV, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.zm zmVar = a61Var2.f36406j0;
                if (zmVar != null) {
                    zmVar.getBackground().setColorFilter(new PorterDuffColorFilter(iV, PorterDuff.Mode.MULTIPLY));
                }
                break;
            default:
                a61 a61Var3 = this.f37256b;
                u41 u41Var = a61Var3.T;
                float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61Var3.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(8.0f));
                View view3 = a61Var3.f36404i0;
                if (view3 != null) {
                    view3.setAlpha(fFloatValue);
                }
                org.telegram.ui.Components.zm zmVar2 = a61Var3.f36406j0;
                if (zmVar2 != null) {
                    zmVar2.setAlpha(fFloatValue * fFloatValue);
                }
                u41Var.setAlpha(fFloatValue);
                u41Var.invalidate();
                a61Var3.invalidate();
                break;
        }
    }
}
