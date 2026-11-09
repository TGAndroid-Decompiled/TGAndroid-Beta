package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bv0 extends AnimatorListenerAdapter {
    public final int f32436a;
    public final cv0 f32437b;

    public bv0(cv0 cv0Var, int i7) {
        this.f32436a = i7;
        this.f32437b = cv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32436a) {
            case 0:
                this.f32437b.f32772s.setVisibility(8);
                return;
            case 1:
                this.f32437b.f32772s.setVisibility(8);
                return;
            default:
                this.f32437b.f32772s.setVisibility(8);
                return;
        }
    }
}
