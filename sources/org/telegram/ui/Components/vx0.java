package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vx0 extends AnimatorListenerAdapter {
    public final int f32072a;
    public final wx0 f32073b;

    public vx0(wx0 wx0Var, int i10) {
        this.f32072a = i10;
        this.f32073b = wx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32072a) {
            case 0:
                this.f32073b.f32376s.setVisibility(8);
                return;
            case 1:
                this.f32073b.f32376s.setVisibility(8);
                return;
            default:
                this.f32073b.f32376s.setVisibility(8);
                return;
        }
    }
}
