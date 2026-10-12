package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f30879a;
    public final ug0 f30880b;

    public tg0(ug0 ug0Var, int i10) {
        this.f30879a = i10;
        this.f30880b = ug0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30879a) {
            case 0:
                this.f30880b.f31160a.f31509n.setVisibility(8);
                return;
            default:
                this.f30880b.f31160a.h.setVisibility(8);
                return;
        }
    }
}
