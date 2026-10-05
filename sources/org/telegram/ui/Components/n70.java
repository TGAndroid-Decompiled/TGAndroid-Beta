package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n70 extends AnimatorListenerAdapter {
    public final int f28992a;
    public final o70 f28993b;

    public n70(o70 o70Var, int i10) {
        this.f28992a = i10;
        this.f28993b = o70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28992a) {
            case 0:
                o70 o70Var = this.f28993b;
                o70Var.f29387e.f29620d0 = null;
                o70Var.requestLayout();
                return;
            default:
                o70 o70Var2 = this.f28993b;
                o70Var2.f29387e.f29620d0 = null;
                o70Var2.f29384a = false;
                return;
        }
    }
}
