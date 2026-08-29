package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w8 implements ValueAnimator.AnimatorUpdateListener {
    public final float f34350a;
    public final float f34351b;
    public final boolean f34352c;
    public final b9 d;

    public w8(b9 b9Var, float f9, float f10, boolean z10) {
        this.d = b9Var;
        this.f34350a = f9;
        this.f34351b = f10;
        this.f34352c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b9 b9Var = this.d;
        b9Var.J = floatValue;
        float lerp = AndroidUtilities.lerp(this.f34350a, this.f34351b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
        lVar.getTitleTextView().setAlpha(b9Var.J);
        if (b9Var.B && !this.f34352c) {
            b9Var.i0(1.0f - b9Var.J, false);
        }
        b9Var.f27009r.setTranslationY(lerp);
        b9Var.f27012x.setTranslationY(lerp);
        b9Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.o2) b9Var).actionBar;
        lVar2.invalidate();
    }
}
