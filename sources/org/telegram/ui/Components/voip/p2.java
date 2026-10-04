package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32070a;
    public final q2 f32071b;

    public p2(q2 q2Var, int i10) {
        this.f32070a = i10;
        this.f32071b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32070a) {
            case 0:
                this.f32071b.f32094b.setVisibility(8);
                return;
            default:
                this.f32071b.f32095c.setVisibility(8);
                return;
        }
    }
}
