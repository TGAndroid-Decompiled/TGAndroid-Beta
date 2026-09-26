package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l70 extends AnimatorListenerAdapter {
    public final int f25987a;
    public final m70 f25988b;

    public l70(m70 m70Var, int i10) {
        this.f25987a = i10;
        this.f25988b = m70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25987a) {
            case 0:
                m70 m70Var = this.f25988b;
                m70Var.e.f26691d0 = null;
                m70Var.requestLayout();
                return;
            default:
                m70 m70Var2 = this.f25988b;
                m70Var2.e.f26691d0 = null;
                m70Var2.f26326a = false;
                return;
        }
    }
}
