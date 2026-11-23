package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g10 extends AnimatorListenerAdapter {
    public final int f35324a;
    public final i10 f35325b;

    public g10(i10 i10Var, int i7) {
        this.f35324a = i7;
        this.f35325b = i10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35324a) {
            case 0:
                i10 i10Var = this.f35325b;
                org.telegram.messenger.ls.f(i10Var.f36066r.f36309a).j(i10Var.f36064f);
                i10Var.requestLayout();
                return;
            default:
                i10 i10Var2 = this.f35325b;
                i10Var2.d = null;
                i10Var2.f36060a = null;
                i10Var2.f36061b = false;
                return;
        }
    }
}
