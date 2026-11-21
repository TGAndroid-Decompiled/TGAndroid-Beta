package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j60 extends AnimatorListenerAdapter {
    public final int f36431a;
    public final k60 f36432b;

    public j60(k60 k60Var, int i7) {
        this.f36431a = i7;
        this.f36432b = k60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36431a) {
            case 0:
                k60 k60Var = this.f36432b;
                k60Var.f36816e.Y1 = null;
                k60Var.requestLayout();
                return;
            default:
                k60 k60Var2 = this.f36432b;
                k60Var2.f36816e.Y1 = null;
                k60Var2.f36813a = false;
                return;
        }
    }
}
