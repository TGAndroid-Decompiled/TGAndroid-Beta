package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f22934a;
    public final cg0 f22935b;

    public bg0(cg0 cg0Var, int i10) {
        this.f22934a = i10;
        this.f22935b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22934a) {
            case 0:
                this.f22935b.f23311a.f23633n.setVisibility(8);
                return;
            default:
                this.f22935b.f23311a.h.setVisibility(8);
                return;
        }
    }
}
