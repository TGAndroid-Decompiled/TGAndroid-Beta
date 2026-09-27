package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m70 extends AnimatorListenerAdapter {
    public final int f26367a;
    public final n70 f26368b;

    public m70(n70 n70Var, int i10) {
        this.f26367a = i10;
        this.f26368b = n70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26367a) {
            case 0:
                n70 n70Var = this.f26368b;
                n70Var.e.f27015d0 = null;
                n70Var.requestLayout();
                return;
            default:
                n70 n70Var2 = this.f26368b;
                n70Var2.e.f27015d0 = null;
                n70Var2.f26743a = false;
                return;
        }
    }
}
