package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n70 extends AnimatorListenerAdapter {
    public final int f26602a;
    public final o70 f26603b;

    public n70(o70 o70Var, int i10) {
        this.f26602a = i10;
        this.f26603b = o70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26602a) {
            case 0:
                o70 o70Var = this.f26603b;
                o70Var.e.f27266d0 = null;
                o70Var.requestLayout();
                return;
            default:
                o70 o70Var2 = this.f26603b;
                o70Var2.e.f27266d0 = null;
                o70Var2.f27018a = false;
                return;
        }
    }
}
