package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e30 extends AnimatorListenerAdapter {
    public final int f22546a;
    public final j30 f22547b;

    public e30(j30 j30Var, int i10) {
        this.f22546a = i10;
        this.f22547b = j30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22546a) {
            case 0:
                j30 j30Var = this.f22547b;
                j30Var.f24211b.setVisibility(8);
                j30Var.f24221y = false;
                j30Var.E = 0.0f;
                return;
            default:
                this.f22547b.e.setVisibility(8);
                return;
        }
    }
}
