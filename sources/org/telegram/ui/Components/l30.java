package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l30 extends AnimatorListenerAdapter {
    public final int f28243a;
    public final q30 f28244b;

    public l30(q30 q30Var, int i10) {
        this.f28243a = i10;
        this.f28244b = q30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28243a) {
            case 0:
                q30 q30Var = this.f28244b;
                q30Var.f30013b.setVisibility(8);
                q30Var.f30024y = false;
                q30Var.E = 0.0f;
                return;
            default:
                this.f28244b.f30017e.setVisibility(8);
                return;
        }
    }
}
