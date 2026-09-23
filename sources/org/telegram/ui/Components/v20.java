package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f28630a;
    public final a30 f28631b;

    public v20(a30 a30Var, int i10) {
        this.f28630a = i10;
        this.f28631b = a30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28630a) {
            case 0:
                a30 a30Var = this.f28631b;
                a30Var.f22337b.setVisibility(8);
                a30Var.f22347y = false;
                a30Var.E = 0.0f;
                return;
            default:
                this.f28631b.e.setVisibility(8);
                return;
        }
    }
}
