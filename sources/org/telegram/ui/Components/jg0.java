package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jg0 extends AnimatorListenerAdapter {
    public final int f27526a;
    public final kg0 f27527b;

    public jg0(kg0 kg0Var, int i10) {
        this.f27526a = i10;
        this.f27527b = kg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27526a) {
            case 0:
                this.f27527b.f27874a.f28155n.setVisibility(8);
                return;
            default:
                this.f27527b.f27874a.h.setVisibility(8);
                return;
        }
    }
}
