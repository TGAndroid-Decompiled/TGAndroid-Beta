package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f28979a;
    public final a30 f28980b;

    public v20(a30 a30Var, int i10) {
        this.f28979a = i10;
        this.f28980b = a30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28979a) {
            case 0:
                a30 a30Var = this.f28980b;
                a30Var.f22560b.setVisibility(8);
                a30Var.f22570y = false;
                a30Var.E = 0.0f;
                return;
            default:
                this.f28980b.e.setVisibility(8);
                return;
        }
    }
}
