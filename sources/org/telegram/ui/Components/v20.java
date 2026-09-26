package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f28985a;
    public final a30 f28986b;

    public v20(a30 a30Var, int i10) {
        this.f28985a = i10;
        this.f28986b = a30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28985a) {
            case 0:
                a30 a30Var = this.f28986b;
                a30Var.f22574b.setVisibility(8);
                a30Var.f22584y = false;
                a30Var.E = 0.0f;
                return;
            default:
                this.f28986b.e.setVisibility(8);
                return;
        }
    }
}
