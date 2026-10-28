package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x70 extends AnimatorListenerAdapter {
    public final int f34694a;
    public final y70 f34695b;

    public x70(y70 y70Var, int i10) {
        this.f34694a = i10;
        this.f34695b = y70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34694a) {
            case 0:
                y70 y70Var = this.f34695b;
                y70Var.e.f35264d0 = null;
                y70Var.requestLayout();
                return;
            default:
                y70 y70Var2 = this.f34695b;
                y70Var2.e.f35264d0 = null;
                y70Var2.f34985a = false;
                return;
        }
    }
}
