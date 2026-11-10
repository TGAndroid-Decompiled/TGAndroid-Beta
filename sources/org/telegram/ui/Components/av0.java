package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class av0 extends AnimatorListenerAdapter {
    public final int f32019a;
    public final bv0 f32020b;

    public av0(bv0 bv0Var, int i7) {
        this.f32019a = i7;
        this.f32020b = bv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32019a) {
            case 0:
                this.f32020b.f32372s.setVisibility(8);
                return;
            case 1:
                this.f32020b.f32372s.setVisibility(8);
                return;
            default:
                this.f32020b.f32372s.setVisibility(8);
                return;
        }
    }
}
