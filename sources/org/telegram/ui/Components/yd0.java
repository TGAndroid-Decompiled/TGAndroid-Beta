package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f41978a;
    public final zd0 f41979b;

    public yd0(zd0 zd0Var, int i7) {
        this.f41978a = i7;
        this.f41979b = zd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41978a) {
            case 0:
                this.f41979b.f42342a.f32976n.setVisibility(8);
                return;
            default:
                this.f41979b.f42342a.h.setVisibility(8);
                return;
        }
    }
}
