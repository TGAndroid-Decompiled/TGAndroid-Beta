package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag0 extends AnimatorListenerAdapter {
    public final int f22647a;
    public final bg0 f22648b;

    public ag0(bg0 bg0Var, int i10) {
        this.f22647a = i10;
        this.f22648b = bg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22647a) {
            case 0:
                this.f22648b.f22967a.f23295n.setVisibility(8);
                return;
            default:
                this.f22648b.f22967a.h.setVisibility(8);
                return;
        }
    }
}
