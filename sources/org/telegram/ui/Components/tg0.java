package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f30876a;
    public final ug0 f30877b;

    public tg0(ug0 ug0Var, int i10) {
        this.f30876a = i10;
        this.f30877b = ug0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30876a) {
            case 0:
                this.f30877b.f31165a.f31508n.setVisibility(8);
                return;
            default:
                this.f30877b.f31165a.h.setVisibility(8);
                return;
        }
    }
}
