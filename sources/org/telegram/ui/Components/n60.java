package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class n60 extends AnimatorListenerAdapter {

    public final int f30888a;

    public final o60 f30889b;

    public n60(o60 o60Var, int i10) {
        this.f30888a = i10;
        this.f30889b = o60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30888a) {
            case 0:
                o60 o60Var = this.f30889b;
                o60Var.f31176e.Z = null;
                o60Var.requestLayout();
                break;
            default:
                o60 o60Var2 = this.f30889b;
                o60Var2.f31176e.Z = null;
                o60Var2.f31173a = false;
                break;
        }
    }
}
