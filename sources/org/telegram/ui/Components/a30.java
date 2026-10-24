package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a30 extends AnimatorListenerAdapter {
    public final int f24614a;
    public final g30 f24615b;

    public a30(g30 g30Var, int i10) {
        this.f24614a = i10;
        this.f24615b = g30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24614a) {
            case 0:
                g30 g30Var = this.f24615b;
                g30Var.f26539b.setVisibility(8);
                g30Var.f26549y = false;
                g30Var.E = 0.0f;
                return;
            default:
                this.f24615b.e.setVisibility(8);
                return;
        }
    }
}
