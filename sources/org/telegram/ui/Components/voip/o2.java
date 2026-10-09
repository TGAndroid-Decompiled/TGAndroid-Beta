package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f32120a;
    public final p2 f32121b;

    public o2(p2 p2Var, int i10) {
        this.f32120a = i10;
        this.f32121b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32120a) {
            case 0:
                this.f32121b.f32164b.setVisibility(8);
                return;
            default:
                this.f32121b.f32165c.setVisibility(8);
                return;
        }
    }
}
