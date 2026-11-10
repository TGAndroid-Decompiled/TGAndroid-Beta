package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f40559a;
    public final zd0 f40560b;

    public yd0(zd0 zd0Var, int i7) {
        this.f40559a = i7;
        this.f40560b = zd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40559a) {
            case 0:
                this.f40560b.f40919a.f31846n.setVisibility(8);
                return;
            default:
                this.f40560b.f40919a.h.setVisibility(8);
                return;
        }
    }
}
