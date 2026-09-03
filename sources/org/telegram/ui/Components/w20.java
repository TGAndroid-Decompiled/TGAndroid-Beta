package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f30119a;
    public final b30 f30120b;

    public w20(b30 b30Var, int i10) {
        this.f30119a = i10;
        this.f30120b = b30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30119a) {
            case 0:
                b30 b30Var = this.f30120b;
                b30Var.f23533b.setVisibility(8);
                b30Var.f23541y = false;
                b30Var.B = 0.0f;
                return;
            default:
                this.f30120b.e.setVisibility(8);
                return;
        }
    }
}
