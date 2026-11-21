package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g10 extends AnimatorListenerAdapter {
    public final int f35360a;
    public final i10 f35361b;

    public g10(i10 i10Var, int i7) {
        this.f35360a = i7;
        this.f35361b = i10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35360a) {
            case 0:
                i10 i10Var = this.f35361b;
                org.telegram.messenger.ks.f(i10Var.f36118r.f36355a).j(i10Var.f36116f);
                i10Var.requestLayout();
                return;
            default:
                i10 i10Var2 = this.f35361b;
                i10Var2.d = null;
                i10Var2.f36112a = null;
                i10Var2.f36113b = false;
                return;
        }
    }
}
