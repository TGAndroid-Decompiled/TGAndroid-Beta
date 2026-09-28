package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag0 extends AnimatorListenerAdapter {
    public final int f22649a;
    public final bg0 f22650b;

    public ag0(bg0 bg0Var, int i10) {
        this.f22649a = i10;
        this.f22650b = bg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22649a) {
            case 0:
                this.f22650b.f22997a.f23296n.setVisibility(8);
                return;
            default:
                this.f22650b.f22997a.h.setVisibility(8);
                return;
        }
    }
}
