package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e30 extends AnimatorListenerAdapter {
    public final int f27703a;
    public final k30 f27704b;

    public e30(k30 k30Var, int i10) {
        this.f27703a = i10;
        this.f27704b = k30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27703a) {
            case 0:
                k30 k30Var = this.f27704b;
                k30Var.f29788b.setVisibility(8);
                k30Var.f29798y = false;
                k30Var.E = 0.0f;
                return;
            default:
                this.f27704b.e.setVisibility(8);
                return;
        }
    }
}
