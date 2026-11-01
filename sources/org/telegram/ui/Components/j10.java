package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j10 extends AnimatorListenerAdapter {
    public final int f27247a;
    public final k10 f27248b;

    public j10(k10 k10Var, int i10) {
        this.f27247a = i10;
        this.f27248b = k10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27247a) {
            case 0:
                k10 k10Var = this.f27248b;
                org.telegram.messenger.at.f(k10Var.f27692r.f28014a).j(k10Var.f27690f);
                k10Var.requestLayout();
                return;
            default:
                k10 k10Var2 = this.f27248b;
                k10Var2.d = null;
                k10Var2.f27687a = null;
                k10Var2.f27688b = false;
                return;
        }
    }
}
