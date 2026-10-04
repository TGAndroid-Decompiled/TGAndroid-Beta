package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32071a;
    public final q2 f32072b;

    public p2(q2 q2Var, int i10) {
        this.f32071a = i10;
        this.f32072b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32071a) {
            case 0:
                this.f32072b.f32095b.setVisibility(8);
                return;
            default:
                this.f32072b.f32096c.setVisibility(8);
                return;
        }
    }
}
