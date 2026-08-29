package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pw0 extends AnimatorListenerAdapter {
    public final int f31796a;
    public final qw0 f31797b;

    public pw0(qw0 qw0Var, int i10) {
        this.f31796a = i10;
        this.f31797b = qw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31796a) {
            case 0:
                this.f31797b.f32126s.setVisibility(8);
                return;
            case 1:
                this.f31797b.f32126s.setVisibility(8);
                return;
            default:
                this.f31797b.f32126s.setVisibility(8);
                return;
        }
    }
}
