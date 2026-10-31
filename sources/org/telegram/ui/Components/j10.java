package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j10 extends AnimatorListenerAdapter {
    public final int f27191a;
    public final k10 f27192b;

    public j10(k10 k10Var, int i10) {
        this.f27191a = i10;
        this.f27192b = k10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27191a) {
            case 0:
                k10 k10Var = this.f27192b;
                org.telegram.messenger.zs.f(k10Var.f27604r.f27964a).j(k10Var.f27602f);
                k10Var.requestLayout();
                return;
            default:
                k10 k10Var2 = this.f27192b;
                k10Var2.d = null;
                k10Var2.f27599a = null;
                k10Var2.f27600b = false;
                return;
        }
    }
}
