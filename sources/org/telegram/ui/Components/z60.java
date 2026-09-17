package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f33088a;
    public final a70 f33089b;

    public z60(a70 a70Var, int i10) {
        this.f33088a = i10;
        this.f33089b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33088a) {
            case 0:
                a70 a70Var = this.f33089b;
                a70Var.f24300e.f24571d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f33089b;
                a70Var2.f24300e.f24571d0 = null;
                a70Var2.f24297a = false;
                return;
        }
    }
}
