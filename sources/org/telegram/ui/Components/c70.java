package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c70 extends AnimatorListenerAdapter {
    public final int f25824a;
    public final d70 f25825b;

    public c70(d70 d70Var, int i10) {
        this.f25824a = i10;
        this.f25825b = d70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25824a) {
            case 0:
                d70 d70Var = this.f25825b;
                d70Var.f26207e.f26456a0 = null;
                d70Var.requestLayout();
                return;
            default:
                d70 d70Var2 = this.f25825b;
                d70Var2.f26207e.f26456a0 = null;
                d70Var2.f26204a = false;
                return;
        }
    }
}
