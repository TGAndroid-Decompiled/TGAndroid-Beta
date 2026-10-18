package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25086a;
    public final i30 f25087b;

    public c30(i30 i30Var, int i10) {
        this.f25086a = i10;
        this.f25087b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25086a) {
            case 0:
                i30 i30Var = this.f25087b;
                i30Var.f27060b.setVisibility(8);
                i30Var.f27070y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25087b.e.setVisibility(8);
                return;
        }
    }
}
