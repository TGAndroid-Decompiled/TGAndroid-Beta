package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n70 extends AnimatorListenerAdapter {
    public final int f28891a;
    public final o70 f28892b;

    public n70(o70 o70Var, int i10) {
        this.f28891a = i10;
        this.f28892b = o70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28891a) {
            case 0:
                o70 o70Var = this.f28892b;
                o70Var.f29278e.f29538d0 = null;
                o70Var.requestLayout();
                return;
            default:
                o70 o70Var2 = this.f28892b;
                o70Var2.f29278e.f29538d0 = null;
                o70Var2.f29275a = false;
                return;
        }
    }
}
