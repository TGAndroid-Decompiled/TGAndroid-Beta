package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a70 extends AnimatorListenerAdapter {
    public final int f22378a;
    public final b70 f22379b;

    public a70(b70 b70Var, int i10) {
        this.f22378a = i10;
        this.f22379b = b70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22378a) {
            case 0:
                b70 b70Var = this.f22379b;
                b70Var.e.f22954d0 = null;
                b70Var.requestLayout();
                return;
            default:
                b70 b70Var2 = this.f22379b;
                b70Var2.e.f22954d0 = null;
                b70Var2.f22591a = false;
                return;
        }
    }
}
