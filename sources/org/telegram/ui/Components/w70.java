package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w70 extends AnimatorListenerAdapter {
    public final int f34384a;
    public final x70 f34385b;

    public w70(x70 x70Var, int i10) {
        this.f34384a = i10;
        this.f34385b = x70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34384a) {
            case 0:
                x70 x70Var = this.f34385b;
                x70Var.e.f34947d0 = null;
                x70Var.requestLayout();
                return;
            default:
                x70 x70Var2 = this.f34385b;
                x70Var2.e.f34947d0 = null;
                x70Var2.f34652a = false;
                return;
        }
    }
}
