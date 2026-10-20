package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25093a;
    public final i30 f25094b;

    public c30(i30 i30Var, int i10) {
        this.f25093a = i10;
        this.f25094b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25093a) {
            case 0:
                i30 i30Var = this.f25094b;
                i30Var.f27103b.setVisibility(8);
                i30Var.f27113y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25094b.e.setVisibility(8);
                return;
        }
    }
}
