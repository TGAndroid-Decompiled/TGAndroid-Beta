package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e30 extends AnimatorListenerAdapter {
    public final int f27705a;
    public final k30 f27706b;

    public e30(k30 k30Var, int i10) {
        this.f27705a = i10;
        this.f27706b = k30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27705a) {
            case 0:
                k30 k30Var = this.f27706b;
                k30Var.f29790b.setVisibility(8);
                k30Var.f29800y = false;
                k30Var.E = 0.0f;
                return;
            default:
                this.f27706b.e.setVisibility(8);
                return;
        }
    }
}
