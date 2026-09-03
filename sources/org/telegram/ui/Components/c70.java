package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c70 extends AnimatorListenerAdapter {
    public final int f25799a;
    public final d70 f25800b;

    public c70(d70 d70Var, int i10) {
        this.f25799a = i10;
        this.f25800b = d70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25799a) {
            case 0:
                d70 d70Var = this.f25800b;
                d70Var.f26210e.f26467a0 = null;
                d70Var.requestLayout();
                return;
            default:
                d70 d70Var2 = this.f25800b;
                d70Var2.f26210e.f26467a0 = null;
                d70Var2.f26207a = false;
                return;
        }
    }
}
