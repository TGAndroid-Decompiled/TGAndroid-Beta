package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f28986a;
    public final a30 f28987b;

    public v20(a30 a30Var, int i10) {
        this.f28986a = i10;
        this.f28987b = a30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28986a) {
            case 0:
                a30 a30Var = this.f28987b;
                a30Var.f22575b.setVisibility(8);
                a30Var.f22585y = false;
                a30Var.E = 0.0f;
                return;
            default:
                this.f28987b.e.setVisibility(8);
                return;
        }
    }
}
