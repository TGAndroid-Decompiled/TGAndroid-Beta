package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32243a;
    public final q2 f32244b;

    public p2(q2 q2Var, int i10) {
        this.f32243a = i10;
        this.f32244b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32243a) {
            case 0:
                this.f32244b.f32287b.setVisibility(8);
                return;
            default:
                this.f32244b.f32288c.setVisibility(8);
                return;
        }
    }
}
