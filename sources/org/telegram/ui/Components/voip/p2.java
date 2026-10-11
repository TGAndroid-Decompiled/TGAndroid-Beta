package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32179a;
    public final q2 f32180b;

    public p2(q2 q2Var, int i10) {
        this.f32179a = i10;
        this.f32180b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32179a) {
            case 0:
                this.f32180b.f32223b.setVisibility(8);
                return;
            default:
                this.f32180b.f32224c.setVisibility(8);
                return;
        }
    }
}
