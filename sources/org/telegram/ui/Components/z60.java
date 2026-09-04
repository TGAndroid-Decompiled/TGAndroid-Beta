package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f33087a;
    public final a70 f33088b;

    public z60(a70 a70Var, int i10) {
        this.f33087a = i10;
        this.f33088b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33087a) {
            case 0:
                a70 a70Var = this.f33088b;
                a70Var.f24299e.f24570d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f33088b;
                a70Var2.f24299e.f24570d0 = null;
                a70Var2.f24296a = false;
                return;
        }
    }
}
